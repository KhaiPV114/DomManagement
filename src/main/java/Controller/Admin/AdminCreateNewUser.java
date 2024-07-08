package Controller.Admin;

import Entity.Users;
import Service.Impl.UserServiceImpl;
import Service.UserService;
import com.google.api.services.drive.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/user/new")
public class AdminCreateNewUser extends HttpServlet {
    private static final String VIEW_PATH = "/views/admin/create-user.jsp";
    private static final String HOME_PATH = "/views/admin/user.jsp";

    private static UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(VIEW_PATH).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String gmail = req.getParameter("gmail");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String status = req.getParameter("status");
        String role = req.getParameter("role");

        Users newUser = Users.builder()
                .fullName(fullName)
                .roleId(1)
                .gender(gender)
                .password(password)
                .gmail(gmail).build();

        userService.addUser(newUser);

        req.getRequestDispatcher(HOME_PATH).forward(req, resp);
    }
}
