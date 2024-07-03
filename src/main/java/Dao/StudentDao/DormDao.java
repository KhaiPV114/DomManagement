package Dao.StudentDao;

import Dao.GenericDao.GenericDao;
import Entity.Dorm;

import java.util.List;

public interface DormDao extends GenericDao<Dorm> {


    Dorm findById(Integer id);

    void update(Dorm dorm);

    List<Dorm> findAll();
}