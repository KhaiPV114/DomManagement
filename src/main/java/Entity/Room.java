package Entity;

import Enum.RoomStatus;
import Enum.RoomType;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Room {
    private String roomName;
    private long price;
    private RoomType roomType;
    private Integer domId;
    private RoomStatus roomStatus;
    private Integer floor;
}
