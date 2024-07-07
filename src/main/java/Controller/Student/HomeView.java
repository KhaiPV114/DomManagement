package Controller.Student;

import Controller.General.Common;
import Entity.News;
import Service.Impl.NewsServiceImpl;
import Service.NewsService;
import org.checkerframework.checker.units.qual.C;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/student/home")
public class HomeView extends HttpServlet {
    private final NewsService newsService = new NewsServiceImpl();
    private final Common common = new Common();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> newsList = newsService.getAll(0, 10);
        req.setAttribute("news", newsList);
        common.setTitle(req, "Home");
        req.getRequestDispatcher("/views/student/home.jsp").forward(req, resp);
    }
}
