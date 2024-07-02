package Entity;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class Dom {
    private Integer domId;
    private String domName;
    private Integer numberOfFloor;
}
