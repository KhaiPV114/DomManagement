package Controller.General;

import Dto.DomTotalDto;
import Dto.UsersDto;
import Entity.Bed;
import Entity.Dom;
import Entity.Role;
import Entity.Users;
import Enum.BedStatus;
import Service.StudentService.BedService;
import Service.StudentService.DomService;
import Service.StudentService.Impl.BedServiceImpl;
import Service.StudentService.Impl.DomServiceImpl;
import Service.StudentService.Impl.RoleServiceImpl;
import Service.StudentService.Impl.UserServiceImpl;
import Service.StudentService.RoleService;
import Service.StudentService.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Common {
    private final DomService dormService = new DomServiceImpl();
    private final BedService bedService = new BedServiceImpl();
    private final UserService userService = new UserServiceImpl();
    private final RoleService roleService = new RoleServiceImpl();

    public List<DomTotalDto> getListDomDto(){
        List<DomTotalDto> domTotalDtoList = new ArrayList<>();
        List<String> domNames = dormService.getAll().stream().map(Dom::getDomName).toList();

        Map<String, List<Bed>> bedMap = bedService.getAll().stream().collect(Collectors.groupingBy(Bed::getKey));

        for(String domName : domNames){
            String domId = domName.substring(domName.length() - 1);
            int usedBed = 0;
            int freeBed = 0;
            List<Bed> beds = bedMap.get(domId);
            for (Bed bed : beds){
                if(BedStatus.AVAILABLE.equals(bed.getBedStatus())){
                    usedBed++;
                }else {
                    freeBed++;
                }
            }
            DomTotalDto dto =  DomTotalDto.builder()
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

    public List<UsersDto> getListUsersDto(){
        List<UsersDto> usersDtoList = new ArrayList<>();
        List<Users> usersList = userService.getALl().stream().toList();

        for(Users user : usersList){
            if (user != null){
                if (user.getRoleId() == 1 ){
                    UsersDto usersDto = UsersDto.builder()
                            .gmail(user.getGmail())
                            .userId(user.getUserId())
                            .role("Admin")
                            .gender(user.getGender())
                            .status(user.getStatus())
                            .fullName(user.getFullname()).build();
                    usersDtoList.add(usersDto);
                }
            }
        }
        return usersDtoList;
    }

}
