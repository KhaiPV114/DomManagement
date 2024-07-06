package Controller.General;

import Enum.RoomType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/get-amount")
public class GetAmount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key = req.getParameter("roomType");
        RoomType roomType = RoomType.valueOf(key);
        String amount = new Common().convertAmount(roomType.getAmount());
        resp.getWriter().write(amount);
    }

}
