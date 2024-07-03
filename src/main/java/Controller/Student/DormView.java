package Controller.Student;

import Service.StudentService.DormService;
import Service.StudentService.StudentServiceImpl.DormServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/dorm")
public class DormView extends HttpServlet {
    private final DormService dormService = new DormServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dormService.getAll().forEach(x -> System.out.println(x.toString()));
        System.out.println();
        resp.sendRedirect(req.getContextPath()+ "/views/student/dorm.jsp");
    }
}
