package Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDate;

@Getter
@Builder
@ToString
public class News {
    private Integer newsId;
    private String newsTitle;
    private String newsDetail;
    private Timestamp createdTime;
    private String picture;
    private Integer author;
}
