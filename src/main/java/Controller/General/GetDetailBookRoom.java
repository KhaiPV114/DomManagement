package Controller.General;

import Entity.Bed;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/student/detail-book-room")
public class GetDetailBookRoom extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("dom"));
        System.out.println(req.getParameter("floor"));
        System.out.println(req.getParameter("roomType"));


        resp.getWriter().write("hah");

    }
}
