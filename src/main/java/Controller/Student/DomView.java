package Controller.Student;

import Controller.General.Common;
import Dto.DomTotalDto;
import Entity.Bed;
import Entity.Dom;
import Enum.BedStatus;
import Service.StudentService.BedService;
import Service.StudentService.DomService;
import Service.StudentService.Impl.BedServiceImpl;
import Service.StudentService.Impl.DomServiceImpl;
import Service.StudentService.Impl.RoomServiceImpl;
import Service.StudentService.RoomService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet("/student/dom")
public class DomView extends HttpServlet {
    private final DomService dormService = new DomServiceImpl();
    private final BedService bedService = new BedServiceImpl();
    private final RoomService roomService = new RoomServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<DomTotalDto> domTotalDtoList = new Common().getListDomDto();
        req.setAttribute("domTotalDto", domTotalDtoList);
        req.getRequestDispatcher("/views/student/dom.jsp");

    }
}
