package Controller.Student;

import Controller.General.Common;
import Dto.BookRoomDto;
import Entity.Bed;
import Entity.Student;
import Enum.BedStatus;
import Service.StudentService.BedService;
import Service.StudentService.Impl.BedServiceImpl;
import Service.StudentService.Impl.StudentServiceImpl;
import Service.StudentService.StudentService;
import com.google.api.client.util.Strings;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet("/student/book-room")
public class BookRoomView extends HttpServlet {
    private final BedService bedService = new BedServiceImpl();
    private final StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String roomType = Strings.isNullOrEmpty(req.getParameter("roomTypeId")) ? "BIG" : req.getParameter("roomTypeId");
        long roomAmount = Strings.isNullOrEmpty(req.getParameter("roomAmount")) ? 500000 : Long.parseLong(req.getParameter("roomAmount"));

        Set<String> doms = new HashSet<>();
        Set<Integer> floors = new HashSet<>();

        Student userNow = (Student) req.getSession().getAttribute("user");
        Student student = studentService.getByRollId(userNow.getRollId());

        List<Bed> beds = bedService.getByRoomType(roomType);

        long freeBed = beds.stream()
                .peek(x -> {
                    String key = x.getRoomName().substring(0,1);
                    doms.add(key);
                    if("A".equals(key)){
                        floors.add(x.getFloor());
                    }
                })
                .filter(x -> BedStatus.NOTAVAILABLE.equals(x.getBedStatus()))
                .count();

        Common common = new Common();
        long amountSe = roomAmount * 3;
        long studentBalance = student.getBalance();
        BookRoomDto bookRoomDto = BookRoomDto.builder()
                .doms(doms)
                .floors(floors)
                .minimumBalance(common.convertAmount(amountSe))
                .yourAccountBalance(common.convertAmount(studentBalance))
                .roomType(roomType)
                .roomAmount(common.convertAmount(roomAmount))
                .numberSlotsRemaining(freeBed)
                .yourBalanceAfterBooking(common.convertAmount(studentBalance - amountSe))
                .build();

        req.setAttribute("bookRoomDto", bookRoomDto);
        RequestDispatcher rd = req.getRequestDispatcher("/views/student/book-room.jsp");
        rd.forward(req, resp);
    }
}
