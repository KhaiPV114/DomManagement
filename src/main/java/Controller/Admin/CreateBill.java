package Controller.Admin;

import Entity.DomResident;
import Entity.ElectricWaterUsage;
import Entity.RoomBill;
import Enum.Semester;
import Service.DomResidentService;
import Service.EWUsageService;
import Service.Impl.DomResidentServiceImpl;
import Service.Impl.EWUsageServiceImpl;
import Service.Impl.RoomBillServiceImpl;
import Service.RoomBillService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@WebServlet("/admin/create-bill")
public class CreateBill extends HttpServlet {

    private final RoomBillService roomBillService = new RoomBillServiceImpl();
    private final DomResidentService domResidentService = new DomResidentServiceImpl();
    private final EWUsageService ewUsageService = new EWUsageServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int month = LocalDate.now().getMonthValue();
        int year = LocalDate.now().getYear();
        String term;
        if(month < 5){
            term = Semester.DONG.name();
            year--;
        } else if (month < 9){
            term = Semester.XUAN.name();
        } else  {
            term = Semester.HA.name();
        }

        List<DomResident> domResidents = domResidentService.getBySemesterAndYear(term, year);
        Set<String> roomNames = domResidents.stream().map(DomResident::getRoomName).collect(Collectors.toSet());
        List<RoomBill> roomBillList = roomBillService.getByTermAndYear(term, year);
        Set<String> roomNamesInBill = roomBillList.stream().map(RoomBill::getRoomName).collect(Collectors.toSet());
        roomNames.removeAll(roomNamesInBill);

        if (roomNames.size() == 0){
            req.setAttribute("result", "Đã tạo hết hóa don thanh toan cua ky " + term + " - " + year);
            req.getRequestDispatcher("/views/admin/bill.jsp").forward(req, resp);
        } else {
            List<ElectricWaterUsage> usages = ewUsageService.getByTermAndYear(term, year);
            Map<String, List<ElectricWaterUsage>> usagesMap = usages.stream().collect(Collectors.groupingBy(ElectricWaterUsage::getRoomName));

            List<RoomBill> addRoomBills = new ArrayList<>();


        }
    }
}
