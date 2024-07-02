package Controller.AdminController;

import Entity.DomResident;
import Service.StudentService.ResidentRequestService;
import Service.StudentService.StudentServiceImpl.ResidentRequestServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;


@WebServlet("/test")
public class AdminRequestView extends HttpServlet {

    private final ResidentRequestService residentRequestService =  new ResidentRequestServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("a");
        DomResident dom = DomResident.builder()
                .balance(100L)
                .bedId(1)
                .termId(1)
                .userId(1)
                .checkInDate(new Timestamp(2024,10,20,10,00,00,00))
                .checkOutDate(new Timestamp(2024,10,20,10,00,00,00))
                .build();

        System.out.println(dom.toString());
        resp.sendRedirect(req.getContextPath() +"/views/login.jsp");

    }
}
