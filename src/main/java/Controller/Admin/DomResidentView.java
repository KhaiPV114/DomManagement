package Controller.Admin;

import Controller.General.Common;
import Dto.DomResidentDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/dom-resident")
public class DomResidentView extends HttpServlet {
    private final Common common = new Common();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Common common = new Common();
        List<DomResidentDto> domResidentList = common.getDomResidentDto();
        req.setAttribute("domResidentList", domResidentList);
        common.setTitle(req, "domResident");
        req.getRequestDispatcher("/views/admin/dom-resident.jsp").forward(req, resp);
    }
}
