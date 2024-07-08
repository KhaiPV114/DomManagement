package Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@ToString
public class RoomAdminDto {
    private String dom;
    private int floor;
    private String room;
    private String amount;
    private int totalBed;
    private String usedBed;
    private String freeBed;
    private String status;
    private List<StudentBedDto> studentBedDtoList;
}