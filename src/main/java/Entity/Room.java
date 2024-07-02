package Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import Enum.*;
@Getter
@Builder

public class Room {
    private String roomName;
    private long price;
    private RoomType roomType;
    private Integer domId;
    private RoomStatus roomStatus;
    private Integer floor;
}
