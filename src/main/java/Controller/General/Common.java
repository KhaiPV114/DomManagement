package Controller.General;

import Dto.DomResidentDto;
import Dto.DomTotalDto;
import Dto.NewsDto;
import Dto.UsersDto;
import Entity.Bed;
import Entity.Dom;
import Entity.DomResident;
import Entity.News;
import Entity.Users;
import Entity.Student;
import Enum.Semester;
import Enum.BedStatus;
import Service.BedService;
import Service.DomResidentService;
import Service.DomService;
import Service.Impl.BedServiceImpl;
import Service.Impl.DomResidentServiceImpl;
import Service.Impl.DomServiceImpl;
import Service.Impl.NewsServiceImpl;
import Service.Impl.UserServiceImpl;
import Service.NewsService;
import Service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    private final NewsService newsService = new NewsServiceImpl();
    private final DomResidentService domResidentService = new DomResidentServiceImpl();

    public void setTitle(HttpServletRequest req, String title){
        HttpSession session = req.getSession();
        session.setAttribute("title", title);
    }

    public List<DomResidentDto> getDomResidentDto(){
        List<DomResidentDto> domResidentDtoList = new ArrayList<>();
        List<DomResident> domResidentList = domResidentService.getAll();
        List<Bed> bedList = bedService.getAll();

        for (Bed bed : bedList){
            for (DomResident domResident : domResidentList){
                if(domResident.getBedId() == bed.getBedId()){
                    DomResidentDto residentDto = DomResidentDto.builder()
                            .price(domResident.getBalance())
                            .checkOutDate(String.valueOf(domResident.getCheckOutDate()))
                            .year(domResident.getCheckInDate().getYear())
                            .checkInDate(String.valueOf(domResident.getCheckInDate()))
                            .studentId(domResident.getRollId())
                            .bedInformation(String.valueOf(domResident.getBedId()))
                            .semester(domResident.getTermId()).build();
                    domResidentDtoList.add(residentDto);
                }
            }
        }
        return domResidentDtoList;
    }
    public List<NewsDto> getListNewsDto (){
        List<NewsDto> newsDtoList = new ArrayList<>();
        List<News> newsList = newsService.getAll(0, 15);
        List<Users> usersList = userService.getALl();

        for (Users user : usersList){
            for (News news : newsList){
                if(user.getUserId() == news.getAuthor()){
                    NewsDto newsDto = NewsDto.builder()
                            .newsId(news.getNewsId())
                            .newsTitle(news.getNewsTitle())
                            .newsDetail(news.getNewsDetail())
                            .createdTime(news.getCreatedTime())
                            .author(user.getFullName())
                            .authorId(user.getUserId()).build();
                    newsDtoList.add(newsDto);
                }
            }
        }
        return newsDtoList;
    }
    public List<DomTotalDto> getListDomDto() {
        List<DomTotalDto> domTotalDtoList = new ArrayList<>();
        Map<String, String> domNames = dormService.getAll().stream().collect(Collectors.toMap(Dom::getDomName, Dom::getDomGender));

        Map<String, List<Bed>> bedMap = bedService.getAll().stream().collect(Collectors.groupingBy(Bed::getKey));

        for (Map.Entry<String, String> entry : domNames.entrySet()) {
            String domId = entry.getKey().substring(entry.getKey().length() - 1);
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
                    .domName(entry.getKey())
                    .domId(domId)
                    .freeBed(freeBed)
                    .usedBed(usedBed)
                    .totalBed(freeBed + usedBed)
                    .domGender(entry.getValue())
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
