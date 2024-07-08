package Controller.Admin;

import Controller.General.Common;
import Dto.NewsDto;
import Dto.UsersDto;
import Service.Impl.NewsServiceImpl;
import Service.NewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


//thieu dau gach ơ đây này
@WebServlet("/admin/news")
public class NewsView extends HttpServlet {
    private static final String VIEW_PATH =  "/views/admin/news.jsp";
    private static NewsService  newsService = new NewsServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Common common = new Common();
        List<NewsDto> newsDtoList = common.getListNewsDto();
        System.out.println("newsDtoList: " + newsDtoList);

        req.setAttribute("newsDtoList", newsDtoList);

        req.getRequestDispatcher(VIEW_PATH).forward(req, resp);
    }
}
