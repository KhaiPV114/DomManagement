package Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class DomTotalDto {
    private String domName;
    private String domID;
    private int totalBed;
    private int usedBed;
    private int freeBed;
}
