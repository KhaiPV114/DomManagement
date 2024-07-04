package Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Builder
@ToString
public class PaymentHistory {
    private Integer paymentId;
    private String roomName;
    private Timestamp createDate;
    private String description;
    private String status;
    private Long totalAmount;
    private Long totalAmountPaid;
    private Long totalAmountRemain;

}
