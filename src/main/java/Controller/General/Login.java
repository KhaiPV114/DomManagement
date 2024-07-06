package Controller.General;

import Entity.Student;
import Service.Impl.StudentServiceImpl;
import Service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/account-login")
public class Login extends HttpServlet {
    private final StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = studentService.getByRollId("HE171008");
        req.getSession().setAttribute("student", student);
        resp.sendRedirect(req.getContextPath() + "/views/student/home.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = studentService.getByRollId("HE171008");
        req.getSession().setAttribute("student", student);
        resp.sendRedirect(req.getContextPath() + "/views/student/home.jsp");
    }
}
