package Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Builder
@Getter
public class StudentBedDto {
    private String rollId;
    private String fullName;
    private String gender;
    private String gmail;
    private int bed;
}
