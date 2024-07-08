package Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Builder
@ToString
public class RoomBillDto {
    private String roomName;
    private List<EWUsageDto> ewUsages;
    private long baseWaterMoney;
    private long baseElectricMoney;
    private String rollName;
    private String term;
    private int year;
    private String totalAmount;
    private String status;
    private String description;
}
