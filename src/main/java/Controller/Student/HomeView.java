package Controller.Student;

import Controller.General.Common;
import Dto.NewsDto;
import Entity.News;
import Entity.Users;
import Service.Impl.NewsServiceImpl;
import Service.Impl.UserServiceImpl;
import Service.NewsService;
import Service.UserService;
import org.checkerframework.checker.units.qual.C;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@WebServlet("/student/home")
public class HomeView extends HttpServlet {
    private final Common common = new Common();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<NewsDto> newsDtoList = common.getListNewsDto();
        req.setAttribute("news", newsDtoList);
        common.setTitle(req, "Home");
        req.getRequestDispatcher("/views/student/home.jsp").forward(req, resp);
    }
}
