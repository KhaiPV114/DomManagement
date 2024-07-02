package Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Builder
@Getter
@ToString
public class Bed {
    private Integer bedId;
    private boolean bedStatus;
    private String  roomName;
    private Integer floor;
}
