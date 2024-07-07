package Controller.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/dorm-details")
public class DomDetailView extends HttpServlet {
    private static final String VIEW_PATH = "/views/admin/dorm-details.jsp";
    private static final String HOME_PATH = "/views/admin/home.jsp";

    private static static

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect(req.getContextPath() + "/views/admin/dom-detail.jsp");
    }
}
