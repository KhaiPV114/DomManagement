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

    private final ResidentRequestService residentRequestService = new ResidentRequestServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dom: " + residentRequestService.findById(3));
      

        resp.sendRedirect(req.getContextPath() +"/views/login.jsp");

    }
}
