package Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import Enum.BedStatus;
@Builder
@Getter
@ToString
public class Bed {
    private Integer bedId;
    private BedStatus bedStatus;
    private String  roomName;
    private Integer floor;
}
