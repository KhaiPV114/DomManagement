package Controller.Admin;

import Controller.General.Common;
import Dto.DomTotalDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/dorm")
public class DomView extends HttpServlet {
    private static final String VIEW_PATH = "/views/admin/dom.jsp";
    private static final String HOME_PATH = "views/admin/home";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Common common = new Common();
        List<DomTotalDto> domTotalDtoList = common.getListDomDto();
//        System.out.println(" List: " + domTotalDtoList);

        int totalBedInDom = domTotalDtoList.stream().mapToInt(DomTotalDto::getTotalBed).sum();
        int totalUsedBed = domTotalDtoList.stream().mapToInt(DomTotalDto::getUsedBed).sum();
        int totalFreeBed = domTotalDtoList.stream().mapToInt(DomTotalDto::getFreeBed).sum();

        req.setAttribute("domTotalDtoList", domTotalDtoList);
        req.setAttribute("totalBedInDom", totalBedInDom);
        req.setAttribute("totalUsedBed", totalUsedBed);
        req.setAttribute("totalFreeBed", totalFreeBed);
        req.getRequestDispatcher(VIEW_PATH).forward(req, resp);
    }
}
