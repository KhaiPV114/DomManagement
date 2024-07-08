package Controller.Admin;

import Controller.General.Common;
import Entity.DomResident;
import Entity.Room;
import Entity.Student;
import Service.DomResidentService;
import Service.Impl.DomResidentServiceImpl;
import Service.Impl.RoomServiceImpl;
import Service.RoomService;
import com.google.api.client.util.Strings;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

@WebServlet("/admin/room-detail/ew-usage")
public class EWUsageView extends HttpServlet {
    private final Common common = new Common();
    private final RoomService roomService = new RoomServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect(req.getContextPath()+ "/views/admin/ew-usage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int month = Strings.isNullOrEmpty(req.getParameter("month")) ? LocalDate.now().getMonth().getValue() : Integer.valueOf(req.getParameter("month"));
        long eclectricNumber = Strings.isNullOrEmpty(req.getParameter("electric")) ? 0 : Long.parseLong(req.getParameter("electric"));
        long waterNumber = Strings.isNullOrEmpty(req.getParameter("electric")) ? 0 : Long.parseLong(req.getParameter("electric"));
        String roomName = req.getParameter("roomName");

        Room room = roomService.getByRoomName(roomName);
        System.out.println(room.toString());
        resp.sendRedirect(req.getContextPath()+ "/views/admin/ew-usage.jsp");
    }
}
