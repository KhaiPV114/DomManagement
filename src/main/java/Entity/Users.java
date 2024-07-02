package Entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Users {
    private Integer userId;
    private Integer roleId;
    private String password;
    private String gmail;
}
