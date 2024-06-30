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
    private int userId;
    private int roleId;
    private String fullName;
    private String phoneNumber;
    private String gender;
    private long balance;
    private String gmail;
}
