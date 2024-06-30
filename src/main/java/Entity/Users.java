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
    private long userId;
    private long roleId;
    private String fullName;
    private String phoneNumber;
    private String gender;
    private double balance;
    private String gmail;
}
