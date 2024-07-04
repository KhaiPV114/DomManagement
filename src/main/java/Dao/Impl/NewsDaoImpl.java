package Dao.Impl;

import Dao.GenericDao.GenericDao;
import Dao.GenericDao.Impl.GenericDaoImpl;
import Dao.NewsDao;
import Entity.News;
import Mapper.NewsMap;

import java.util.List;

public class NewsDaoImpl extends GenericDaoImpl<News> implements NewsDao {
    @Override
    public News findById(Integer id) {
        String sql = "SELECT * FROM News WHERE newsId = ?";
        return query(sql, new NewsMap(), id).stream().findFirst().orElse(null);
    }

    @Override
    public void update(News news) {
        String sql = "UPDATE News SET newsTitle = ?, newsDetail = ?, picture = ?, authorId = ?, createdTime = ? WHERE newsId = ?";
        update(sql, news.getNewsTitle(), news.getNewsDetail(), news.getPicture(), news.getAuthor(), news.getCreatedTime(), news.getNewsId());
    }

    @Override
    public List<News> findAll() {
        String sql = "SELECT * FROM News";
        return query(sql,new NewsMap());
    }
}
