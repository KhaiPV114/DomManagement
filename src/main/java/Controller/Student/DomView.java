package Controller.Student;

import Service.StudentService.DomService;
import Service.StudentService.StudentServiceImpl.DomServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/dom")
public class DomView extends HttpServlet {
    private final DomService dormService = new DomServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dormService.getAll().forEach(x -> System.out.println(x.toString()));
        System.out.println();
        resp.sendRedirect(req.getContextPath()+ "/views/student/dom.jsp");
    }
}
