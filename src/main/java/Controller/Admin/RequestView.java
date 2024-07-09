package Controller.Admin;

import Controller.General.Common;
import Entity.Request;
import Service.Impl.RequestServiceImpl;
import Service.RequestService;
import org.checkerframework.checker.units.qual.C;

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
    private final Common common = new Common();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Request> requestList = requestService.getAll();

        req.setAttribute("requestList", requestList);
        common.setTitle(req, "request");
        req.getRequestDispatcher(VIEW_PATH).forward(req, resp);
    }
}
