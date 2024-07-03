package Entity;
import Enum.*;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Student {
    private String rollId;
    private String fullName;
    private String gender;
    private Long balance;
    private String gmail;
    private String avatar;

    private StudentStatus studentStatus;
}