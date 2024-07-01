package Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {
    private Integer userId;
    private String rollId;
    private Integer roleId;
    private String fullName;    
    private String phoneNumber;
    private String gender;
    private Long balance;
    private String gmail;
}
