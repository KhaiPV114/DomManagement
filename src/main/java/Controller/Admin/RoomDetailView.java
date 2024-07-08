package Controller.Admin;

import Controller.General.Common;
import Dto.RoomAdminDto;
import Dto.StudentBedDto;
import Entity.Money;
import Entity.Room;
import Service.Impl.MoneyServiceImpl;
import Service.Impl.RoomServiceImpl;
import Service.Impl.StudentServiceImpl;
import Service.MoneyService;
import Service.RoomService;
import Service.StudentService;
import Utils.SendMail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@WebServlet("/admin/room-detail")
public class RoomDetailView extends HttpServlet {
    private final RoomService roomService = new RoomServiceImpl();
    private final StudentService studentService = new StudentServiceImpl();
    private final MoneyService moneyService = new MoneyServiceImpl();
    private final Common common = new Common();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String roomName = req.getParameter("roomName");
        Room room = roomService.getByRoomName(roomName);
        String term = common.getSemester();
        int year = LocalDate.now().getYear();
        Set<StudentBedDto> studentList = studentService.getByRoomNameAndSemesterAndYear(roomName, term, year).stream().collect(Collectors.toSet());
        List<Integer> usedBed = studentList.stream().map(StudentBedDto::getBed).toList();
        List<Integer> freeBed = new ArrayList<>();
        Money money = moneyService.getByMoneyTypeAndRoomType("ROOM", room.getRoomType());
        for (int i = 1; i <= money.getBedTotal(); i++) {
            if (!usedBed.contains(i)) {
                freeBed.add(i);
            }
        }
        String usedBedString = getStringBed(usedBed);
        String freeBedString = getStringBed(freeBed);
        RoomAdminDto roomAdminDto = RoomAdminDto.builder()
                .room(room.getRoomName())
                .dom("Dom" + room.getRoomName())
                .floor(room.getFloor())
                .amount(common.convertAmount(money.getAmount()))
                .totalBed(money.getBedTotal())
                .status(room.getRoomStatus().name())
                .studentBedDtoList(studentList)
                .freeBed(freeBedString)
                .usedBed(usedBedString)
                .build();
        req.setAttribute("roomAdmin", roomAdminDto);
        req.getRequestDispatcher("/views/admin/room-detail.jsp").forward(req, resp);
    }

    private String getStringBed(List<Integer> bed) {
        if (bed.size() == 0) return "0";
        StringBuilder bedString = new StringBuilder(bed.size() + " (Bed no: ");
        for (int i = 0; i < bed.size(); i++) {
            if (i > 0) {
                bedString.append(", ");
            }
            bedString.append(bed.get(i));
        }
        return bedString.append(")").toString();
    }
}
