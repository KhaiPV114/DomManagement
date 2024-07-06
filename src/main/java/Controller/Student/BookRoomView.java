package Controller.Student;

import Controller.General.Common;
import Dto.BookRoomDto;
import Entity.Bed;
import Entity.Student;
import Enum.BedStatus;
import Enum.RoomType;
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
import java.util.Objects;
import java.util.Set;

@WebServlet("/student/book-room")
public class BookRoomView extends HttpServlet {
    private final BedService bedService = new BedServiceImpl();
    private final StudentService studentService = new StudentServiceImpl();

    private final Common common = new Common();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String roomTypeName = Strings.isNullOrEmpty(req.getParameter("roomTypeName")) ? "BIG" : req.getParameter("roomTypeName");
        long roomAmount = Strings.isNullOrEmpty(req.getParameter("roomAmount")) ? 500000 : Long.parseLong(req.getParameter("roomAmount").replaceAll("\\.",""));

        Set<String> doms = new HashSet<>();
        Set<Integer> floors = new HashSet<>();

        Student studentLogin =  common.getStudentSession(req);
        if(Objects.isNull(studentLogin)){
            resp.sendRedirect(req.getContextPath() + "/views/error.jsp");
            return;
        }
        Student student = studentService.getByRollId(studentLogin.getRollId());

        RoomType room = RoomType.valueOf(roomTypeName);

        List<Bed> beds = bedService.getByRoomType(String.valueOf(room.getType()));

        long freeBed = beds.stream()
                .peek(x -> {
                    String key = x.getRoomName().substring(0,1);
                    doms.add(key);
                    if("A".equals(key)){
                        floors.add(x.getFloor());
                    }
                })
                .filter(x -> BedStatus.NOTAVAILABLE.equals(x.getBedStatus()) && x.getFloor().equals(1))
                .count();


        long amountSe = roomAmount * 3;
        long studentBalance = student.getBalance();
        BookRoomDto bookRoomDto = BookRoomDto.builder()
                .doms(doms)
                .floors(floors)
                .key(roomTypeName)
                .minimumBalance(common.convertAmount(amountSe))
                .yourAccountBalance(common.convertAmount(studentBalance))
                .roomType(String.valueOf(room.getType()))
                .roomAmount(common.convertAmount(roomAmount))
                .numberSlotsRemaining(freeBed)
                .yourBalanceAfterBooking(common.convertAmount(studentBalance - amountSe))
                .build();

        req.setAttribute("bookRoomDto", bookRoomDto);
        RequestDispatcher rd = req.getRequestDispatcher("/views/student/book-room.jsp");
        rd.forward(req, resp);
    }
}
