package Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Mail {

    private String from;
    private String recipient;
    private String subject;
    private String content;
    private String type;
}
