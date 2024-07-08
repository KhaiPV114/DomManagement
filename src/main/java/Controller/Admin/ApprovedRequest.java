package Controller.Admin;

import Entity.Bed;
import Entity.DomResident;
import Entity.Money;
import Entity.Request;
import Entity.Student;
import Enum.RequestType;
import Enum.BedStatus;
import Service.BedService;
import Service.DomResidentService;
import Service.Impl.BedServiceImpl;
import Service.Impl.DomResidentServiceImpl;
import Service.Impl.MoneyServiceImpl;
import Service.Impl.RequestServiceImpl;
import Service.Impl.StudentServiceImpl;
import Service.MoneyService;
import Service.RequestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import Enum.RequestStatus;
import Service.StudentService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/request/approved")
public class ApprovedRequest extends HttpServlet {
    private final RequestService requestService = new RequestServiceImpl();
    private final MoneyService moneyService = new MoneyServiceImpl();

    private final BedService bedService = new BedServiceImpl();

    private final DomResidentService domResidentService = new DomResidentServiceImpl();

    private final StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.valueOf(req.getParameter("id"));
        Request request = requestService.getById(id);
        request.setRequestStatus(RequestStatus.ACCEPTED.name());
        requestService.updateStatus(request);

        if (request.getRequestType().equals(RequestType.CHECKIN.name())) {
            Money money = moneyService.getByMoneyTypeAndRoomType("ROOM", request.getRoomType());
            Bed bed = bedService.randomBedByFloorAndDomName(request.getFloor(), request.getDomName());

            DomResident domResident = DomResident.builder()
                    .balance(money.getAmount())
                    .rollId(request.getRollId())
                    .floor(request.getFloor())
                    .bedId(bed.getBedId())
                    .checkInDate(request.getCreateDate())
                    .roomName(bed.getRoomName())
                    .termId(request.getTerm())
                    .build();
            domResidentService.save(domResident);
            bed.setBedStatus(BedStatus.valueOf(BedStatus.AVAILABLE.name()));
            bedService.updateStatus(bed);
            Student student = studentService.getByRollId(request.getRollId());
            long balance = student.getBalance() - money.getAmount() * 4;
            studentService.updateBalance(student.getRollId(), balance);
            resp.sendRedirect(req.getContextPath() + "/admin/request");
        }

    }
}
