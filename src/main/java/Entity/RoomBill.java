package Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Builder
@ToString
public class RoomBill {
    private int billId;
    private long electricMoney;
    private long waterMoney;
    private LocalDate dayCreate;
    private int roomId;
}
