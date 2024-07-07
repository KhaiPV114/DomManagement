package Controller.Student;

import Controller.General.Common;
import Dto.EWUsageDto;
import Dto.RoomBillDto;
import Entity.*;
import Enum.Semester;
import Service.DomResidentService;
import Service.EWUsageService;
import Service.Impl.DomResidentServiceImpl;
import Service.Impl.EWUsageServiceImpl;
import Service.Impl.MoneyServiceImpl;
import Service.Impl.RoomBillServiceImpl;
import Service.MoneyService;
import Service.RoomBillService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@WebServlet("/student/EWBedUsages")
public class ElectricWaterUsageView extends HttpServlet {
    private final Common common = new Common();
    private final RoomBillService roomBillService = new RoomBillServiceImpl();
    private final EWUsageService ewUsageService = new EWUsageServiceImpl();
    private final DomResidentService domResidentService = new DomResidentServiceImpl();

    private final MoneyService moneyService = new MoneyServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = common.getStudentSession(req);
        if (Objects.isNull(student)) {
            resp.sendRedirect("/views/error.jsp");
            return;
        }
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonth().getValue();
        int year = localDate.getYear();
        String term;
        if (month < 5) {
            year--;
            term = Semester.DONG.name();
        } else if (month < 9) {
            term = Semester.XUAN.name();
        } else {
            term = Semester.HA.name();
        }

        RoomBill roomBill = roomBillService.getByRollNameAndTermAndYear(student.getRollId(), term, year);

        if(Objects.isNull(roomBill)){
            req.setAttribute("roomBill", null);
            req.getRequestDispatcher("/views/student/ew-bed-usages.jsp").forward(req, resp);
            return;
        }

        List<ElectricWaterUsage> usages = ewUsageService.getByRoomNameAndYearAndTerm(roomBill.getRoomName(),year, roomBill.getTerm());

        int studentInRoom = domResidentService.countUserInRoomAndTermAndYear(roomBill.getRoomName(), term, year);


        List<Money> monies = moneyService.getByListMoneyType(List.of("ELECTRIC","WATER"));

        Map<String, Long> mapMoney = monies.stream().collect(Collectors.toMap(Money::getMoneyType, Money::getAmount));

        List<EWUsageDto> ewUsageDtos = usages.stream().map(x -> {
            long electricNumber = x.getElectricNumber() / 2;
            long waterNumber = x.getWaterNumber() /2;
            long electricMoney = electricNumber * mapMoney.get("ELECTRIC");
            long waterMoney = waterNumber * mapMoney.get("WATER");
            return EWUsageDto.builder()
                    .id(x.getId())
                    .electricNumber(x.getElectricNumber() / studentInRoom)
                    .waterNumber(x.getWaterNumber() / studentInRoom)
                    .month(x.getMonth())
                    .electricMoney(common.convertAmount(electricMoney))
                    .waterMoney(common.convertAmount(waterMoney))
                    .totalMoney(common.convertAmount(electricMoney + waterMoney))
                    .build();
        }).toList();



        RoomBillDto dto = RoomBillDto.builder()
                .roomName(roomBill.getRoomName())
                .rollName(roomBill.getRollName())
                .status(roomBill.getBillStatus())
                .description(roomBill.getDescription())
                .year(roomBill.getYear())
                .term(roomBill.getTerm())
                .totalAmount(common.convertAmount(roomBill.getTotalAmount()))
                .ewUsages(ewUsageDtos)
                .build();
        common.setTitle(req, "EW");
        System.out.println(dto.toString());
        req.setAttribute("roomBill", dto);
        req.getRequestDispatcher("/views/student/ew-bed-usages.jsp").forward(req, resp);
    }

    private Map<Integer, Map<String, Integer>> getUsage(String term) {
        Map<Integer, Map<String, Integer>> mapUsage = new HashMap<>();
        int x = 0;
        int y = 0;
        if (Semester.XUAN.name().equals(term)) {
            x = 1;
            y = 4;
        } else if (Semester.HA.name().equals(term)) {
            x = 5;
            y = 8;
        } else {
            x = 9;
            y = 12;
        }
        for (int i = x; i <= y ; i++) {
            mapUsage.put(i, new HashMap<>());
        }
        return mapUsage;
    }
}
