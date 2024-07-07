package Controller.Student;

import Controller.General.Common;
import Entity.Request;
import Entity.Student;
import Service.Impl.ResidentRequestServiceImpl;
import Service.ResidentRequestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet("/student/request")
public class MyRequestView extends HttpServlet {
    private final Common common = new Common();
    private final ResidentRequestService residentRequestService = new ResidentRequestServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Student student = common.getStudentSession(req);
        if (Objects.isNull(student)) {
            resp.sendRedirect("/views/error.jsp");
            return;
        }

        List<Request> requestList = residentRequestService.getByRollId(student.getRollId());
        req.setAttribute("requests", requestList);
        common.setTitle(req, "request");
        req.getRequestDispatcher("/views/student/my-request.jsp").forward(req, resp);
    }
}
