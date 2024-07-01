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
public class DomResident {
    private Integer residentId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Long balance;
    private Integer userId;
    private Integer bedId;
    private Integer termId;
}
