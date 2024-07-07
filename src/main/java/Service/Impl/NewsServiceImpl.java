package Service.Impl;

import Dao.Impl.NewsDaoImpl;
import Dao.NewsDao;
import Entity.News;
import Service.NewsService;

import java.util.List;

public class NewsServiceImpl implements NewsService {
    private final NewsDao newsDao = new NewsDaoImpl();
    @Override
    public List<News> getAll(Integer offset, Integer limit) {
        return newsDao.findAll(offset, limit);
    }
}