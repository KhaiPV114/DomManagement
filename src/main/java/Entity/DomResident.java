package Entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Builder
@ToString
public class DomResident {
    private Integer residentId;
    private Timestamp checkInDate;
    private Timestamp checkOutDate;
    private Long balance;
    private Integer userId;
    private Integer bedId;
    private Integer termId;
}
