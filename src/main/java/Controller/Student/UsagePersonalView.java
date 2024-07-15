package Controller.Student;

import Controller.General.Common;
import Dto.UsagePersonalDto;
import Entity.DomResident;
import Entity.ElectricWaterUsage;
import Entity.Student;
import Service.DomResidentService;
import Service.EWUsageService;
import Service.Impl.DomResidentServiceImpl;
import Service.Impl.EWUsageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/student/usage-personal")
public class UsagePersonalView extends HttpServlet {
    private final DomResidentService domResidentService = new DomResidentServiceImpl();
    private final EWUsageService ewUsageService = new EWUsageServiceImpl();
    private final Common common = new Common();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int month = LocalDate.EPOCH.getMonthValue() - 1;
        Student student = common.getStudentSession(req, resp);
        List<DomResident> domResident = domResidentService.getByRollIdAndYear(student.getRollId(), LocalDate.now().getYear());
        List<String> roomName = domResident.stream().map(DomResident::getRoomName).distinct().toList();
        List<UsagePersonalDto> personalDtos = domResidentService.getUsagePersonal(month, roomName);


    }
}
