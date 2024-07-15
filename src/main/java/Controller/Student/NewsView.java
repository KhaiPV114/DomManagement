package Controller.Student;

import Controller.General.Common;
import Dto.NewsDto;
import Entity.News;
import Entity.Users;
import Service.Impl.NewsServiceImpl;
import Service.Impl.UserServiceImpl;
import Service.NewsService;
import Service.UserService;
import com.google.api.client.util.Strings;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@WebServlet("/student/news")
public class NewsView extends HttpServlet {
    private final NewsService newsService = new NewsServiceImpl();
    private final UserService userService = new UserServiceImpl();
    private final Common common = new Common();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = Strings.isNullOrEmpty(req.getParameter("page")) ? 0 : Integer.valueOf(req.getParameter("offset"));
        List<News> news = newsService.getAll(page * 10, 10);
        Map<Integer, Users> usersList = userService.getALl().stream().collect(Collectors.toMap(Users::getUserId, Function.identity()));

        List<NewsDto> newsDtoList = news.stream().map(n -> NewsDto.builder()
                .newsId(n.getNewsId())
                .newsTitle(n.getNewsTitle())
                .newsDetail(n.getNewsDetail())
                .createdTime(n.getCreatedTime())
                .author(usersList.get(n.getAuthor()).getFullName())
                .authorId(n.getAuthor()).build()).collect(Collectors.toList());
        req.setAttribute("news", newsDtoList);
        common.setTitle(req, "News");
        req.getRequestDispatcher("/views/student/news.jsp").forward(req, resp);
    }
}
