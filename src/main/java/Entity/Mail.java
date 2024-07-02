package Entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class Mail {

    private String from;
    private String recipient;
    private String subject;
    private String content;
    private String type;
}
