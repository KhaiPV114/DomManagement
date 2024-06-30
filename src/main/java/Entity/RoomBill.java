package Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomBill {
    private int billId;
    private long electricMoney;
    private long waterMoney;
    private LocalDate dayCreate;
    private int roomId;
}
