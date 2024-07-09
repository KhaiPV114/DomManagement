package Controller.Admin;

import Controller.General.Common;
import Entity.Student;
import Service.Impl.StudentServiceImpl;
import Service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/student")
public class StudentView extends HttpServlet {
    private static final String VIEW_PATH = "/views/admin/student.jsp";
    private static final String HOME_PATH = "/views/admin/home.jsp";
    private static StudentService studentService = new StudentServiceImpl();
    private final Common common = new Common();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentService.getAll();
        req.setAttribute("studentList", studentList);
        common.setTitle(req, "student");
        req.getRequestDispatcher(VIEW_PATH).forward(req, resp);
    }
}
