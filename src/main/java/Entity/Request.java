package Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Request {
    private Integer requestId;
    private String requestStatus;
    private String requestDetail;
    private Integer residentId;
    private String rollId;
    private String requestType;
    private Integer domId;
    private Integer floor;
    private String roomName;
    private Integer termId;
}
