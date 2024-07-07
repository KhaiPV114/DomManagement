package Controller.General;

import Dto.DomTotalDto;
import Dto.UsersDto;
import Entity.Bed;
import Entity.Dom;
import Entity.Users;
import Entity.Student;
import Enum.Semester;
import Enum.BedStatus;
import Service.BedService;
import Service.DomService;
import Service.Impl.BedServiceImpl;
import Service.Impl.DomServiceImpl;
import Service.Impl.RoleServiceImpl;
import Service.Impl.UserServiceImpl;
import Service.RoleService;
import Service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Common {
    private final DomService dormService = new DomServiceImpl();
    private final BedService bedService = new BedServiceImpl();
    private final UserService userService = new UserServiceImpl();

    public List<DomTotalDto> getListDomDto() {
        List<DomTotalDto> domTotalDtoList = new ArrayList<>();
        List<String> domNames = dormService.getAll().stream().map(Dom::getDomName).toList();

        Map<String, List<Bed>> bedMap = bedService.getAll().stream().collect(Collectors.groupingBy(Bed::getKey));

        for (String domName : domNames) {
            String domId = domName.substring(domName.length() - 1);
            int usedBed = 0;
            int freeBed = 0;
            List<Bed> beds = bedMap.get(domId);
            for (Bed bed : beds) {
                if (BedStatus.AVAILABLE.equals(bed.getBedStatus())) {
                    usedBed++;
                } else {
                    freeBed++;
                }
            }
            DomTotalDto dto = DomTotalDto.builder()
                    .domName(domName)
                    .domId(domId)
                    .freeBed(freeBed)
                    .usedBed(usedBed)
                    .totalBed(freeBed + usedBed)
                    .build();
            domTotalDtoList.add(dto);
        }
        return domTotalDtoList;
    }

    public List<UsersDto> getListUsersDto() {
        List<UsersDto> usersDtoList = new ArrayList<>();
        List<Users> usersList = userService.getALl().stream().toList();

        for (Users user : usersList) {
            if (user != null) {
                if (user.getRoleId() == 1) {
                    UsersDto usersDto = UsersDto.builder()
                            .gmail(user.getGmail())
                            .userId(user.getUserId())
                            .role("Admin")
                            .gender(user.getGender())
                            .status(user.getStatus())
                            .fullName(user.getFullName()).build();
                    usersDtoList.add(usersDto);
                }
            }
        }
        return usersDtoList;
    }

    public String convertAmount(long amount) {
        StringBuilder sb = new StringBuilder(String.valueOf(amount));
        int length = sb.length();
        for (int i = length - 3; i > 0; i -= 3) {
            sb.insert(i, ',');

        }
        return sb.toString();
    }

    public Student getStudentSession(HttpServletRequest req) {
        return (Student) req.getSession().getAttribute("student");
    }

    public String getSemester() {
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonth().getValue();
        if (month < 5) {
            return Semester.XUAN.name();
        } else if (month < 9) {
            return Semester.HA.name();
        } else {
            return Semester.DONG.name();
        }
    }

    public String convertTimeToStringYYYYMMDD(Timestamp timestamp) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        return sdf.format(timestamp);

    }
}
