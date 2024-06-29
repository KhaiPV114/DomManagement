
package Models;

import Enum.Gender;
import Enum.Role;
import java.time.LocalDateTime;


public class User {
    private Integer userId;
    private String rollId;
    private String fullName;
    private String campus;
    private String phoneNumber;
    private Gender gender;
    private String term;
    private Long balance;
    private String gmail;
    private LocalDateTime createdAt;
    private Role role;
}
