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
public class News {
    private int newsId;
    private String newsTitle;
    private String newsDetail;
    private LocalDate createdTime;
    private String picture;
    private int author;
}
