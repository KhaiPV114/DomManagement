package Controller.Admin;

import Controller.General.Common;
import Dto.RoomBillAdminDto;
import Entity.RoomBill;
import Enum.Semester;
import Entity.DomResident;
import Entity.ElectricWaterUsage;
import Service.DomResidentService;
import Service.EWUsageService;
import Service.Impl.DomResidentServiceImpl;
import Service.Impl.EWUsageServiceImpl;
import Service.Impl.RoomBillServiceImpl;
import Service.RoomBillService;
import com.google.api.client.util.Strings;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@WebServlet("/admin/bill")
public class BillView extends HttpServlet {
    private final DomResidentService domResidentService = new DomResidentServiceImpl();

    private final EWUsageService ewUsageService = new EWUsageServiceImpl();

    private final RoomBillService roomBillService = new RoomBillServiceImpl();
    private final Common common = new Common();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDate date = LocalDate.now().minusMonths(1);
        int month = date.getMonthValue();
        int year = date.getYear();
        List<DomResident> domResidents = domResidentService.getByPrevMonthAndYear(month, year);
        List<ElectricWaterUsage> electricWaterUsages = ewUsageService.getByPrevMonthAndYear(month, year);
        Set<String> roomName = domResidents.stream().map(DomResident::getRoomName).collect(Collectors.toSet());
        Set<String> roomNameInBill = electricWaterUsages.stream().map(ElectricWaterUsage::getRoomName).collect(Collectors.toSet());
        roomName.removeAll(roomNameInBill);
        if (roomName.size() > 0) {
            StringBuilder sb = new StringBuilder("Còn 1 số phòng chưa nhập số tiền điện và nước đước sử dụng trong tháng ").append(month).append(": ");
            sb.append(roomName.stream().collect(Collectors.joining(", "))).append(".");
            req.setAttribute("message", sb.toString());
        } else {
            String result = Strings.isNullOrEmpty(req.getParameter("result")) ? null : req.getParameter("result");
            req.setAttribute("result", result);
        }
        String term;
        if (month < 5) {
            term = Semester.DONG.name();
        } else if (month < 9) {
            term = Semester.XUAN.name();
        } else {
            term = Semester.HA.name();
        }
        List<RoomBill> roomBills = roomBillService.getAll();
        List<RoomBillAdminDto> roomBillAdminDtos = roomBills.stream().map(x -> RoomBillAdminDto.builder()
                .billId(x.getBillId())
                .billStatus(x.getBillStatus())
                .rollName(x.getRollName())
                .roomName(x.getRoomName())
                .dayCreate(x.getDayCreate())
                .electricNumber(x.getElectricNumber())
                .electricMoney(common.convertAmount(x.getElectricMoney()))
                .waterNumber(x.getWaterNumber())
                .waterMoney(common.convertAmount(x.getWaterMoney()))
                .totalAmount(common.convertAmount(x.getTotalAmount()))
                .description(x.getDescription())
                .term(x.getTerm())
                .year(x.getYear())
                .build()).toList();
        req.setAttribute("roomBills", roomBillAdminDtos);
        req.setAttribute("term", term);
        req.getRequestDispatcher("/views/admin/bill.jsp").forward(req, resp);
    }
}
