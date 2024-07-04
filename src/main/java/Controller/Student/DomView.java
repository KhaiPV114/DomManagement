package Controller.Student;

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
import java.util.List;
import java.util.Map;

@WebServlet("/student/dom")
public class DomView extends HttpServlet {
    private final DomService dormService = new DomServiceImpl();
    private final BedService bedService = new BedServiceImpl();
    private final RoomService roomService = new RoomServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Dom> doms = dormService.getAll();
        List<DomTotalDto> domTotalDtoList = doms.stream()
                .map(x -> DomTotalDto.builder()
                        .domName(x.getDomName())
                        .domID(String.valueOf(x.getDomName().charAt(x.getDomName().length() - 1)))
                        .build())
                .toList();
        List<Bed> beds = bedService.getAll();
        for(Bed bed : beds){
            String domId = bed.getRoomName().substring(1);
            switch (domId){
                case "A" :
                    if (BedStatus.AVAILABLE.equals(bed.getBedStatus())){

                    }
            }
        }
        beds.forEach(System.out::println);
        roomService.getAll().forEach(System.out::println);
        resp.sendRedirect(req.getContextPath()+ "/views/student/dom.jsp");
    }
}
