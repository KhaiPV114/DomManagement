package Entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class News {
    private Integer newsId;
    private String newsTitle;
    private String newsDetail;
    private LocalDate createdTime;
    private String picture;
    private Integer author;
}
