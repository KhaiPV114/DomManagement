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
    private int residentId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private long balance;
    private int userId;
    private int bedId;
    private int termId;
}
