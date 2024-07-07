package Controller.Student;

import Entity.Request;
import Service.Impl.ResidentRequestServiceImpl;
import Service.ResidentRequestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/request-detail")
public class RequestDetailView extends HttpServlet {
    private final ResidentRequestService residentRequestService = new ResidentRequestServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer requestId = Integer.valueOf(req.getParameter("requestId"));

        Request request = residentRequestService.findById(requestId);

        req.setAttribute("request", request);
        req.getRequestDispatcher("/views/student/request-details.jsp").forward(req, resp);
    }
}
