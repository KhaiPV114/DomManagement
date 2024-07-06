package Controller.Student;

import Controller.General.Common;
import Dto.DomTotalDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/student/dom")
public class DomView extends HttpServlet {

    private final Common common = new Common();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<DomTotalDto> domTotalDtoList = common.getListDomDto();
        req.setAttribute("domTotalDto", domTotalDtoList);
        req.setAttribute("semester", common.getSemester() + " - " + LocalDate.now().getYear());
        RequestDispatcher rd = req.getRequestDispatcher("/views/student/dom.jsp");
        rd.forward(req, resp);
    }
}
