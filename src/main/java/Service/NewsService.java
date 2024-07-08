package Service;

import Entity.News;

import java.util.List;

public interface NewsService {
    List<News> getAll(Integer offset, Integer limit);
    News getById(int id);

    void insert(News news);
}
