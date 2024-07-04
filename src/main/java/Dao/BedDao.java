package Dao;

import Dao.GenericDao.GenericDao;
import Entity.Bed;

import java.util.List;

public interface BedDao extends GenericDao<Bed> {
    Bed findById(Integer id);

    void update(Bed bed);

    List<Bed> findAll();
}
