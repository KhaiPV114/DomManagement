package Entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class Term {
    private int termId;
    private String termName;
}
