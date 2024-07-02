package Entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GoogleUser {
    private String email;
    private String picture;
    private String name;
    private String rollName;

}
