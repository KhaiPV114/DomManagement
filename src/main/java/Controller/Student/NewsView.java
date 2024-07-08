package Controller.Student;

import Controller.General.Common;
import Entity.News;
import Service.Impl.NewsServiceImpl;
import Service.NewsService;
import com.google.api.client.util.Strings;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/student/news")
public class NewsView extends HttpServlet {
    private final NewsService newsService = new NewsServiceImpl();
    private final Common common = new Common();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = Strings.isNullOrEmpty(req.getParameter("page")) ? 0 : Integer.valueOf(req.getParameter("offset"));
        List<News> news = newsService.getAll(page * 10, 10);
        req.setAttribute("news", news);
        common.setTitle(req, "News");
        req.getRequestDispatcher("/views/student/news.jsp").forward(req, resp);
    }
}
