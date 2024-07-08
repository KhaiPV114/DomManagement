package Controller.Admin;

import Entity.Request;
import Service.Impl.RequestServiceImpl;
import Service.RequestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/request")
public class RequestView extends HttpServlet {

    private static final String VIEW_PATH = "/views/admin/request.jsp";
    private static RequestService requestService = new RequestServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Request> requestList = requestService.getAll();
        System.out.println("List of requests: " + requestList);

        req.setAttribute("requestList", requestList);
        req.getRequestDispatcher(VIEW_PATH).forward(req, resp);
    }
}
