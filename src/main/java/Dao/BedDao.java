package Dao;

import Dao.GenericDao.GenericDao;
import Entity.Bed;

import java.util.List;

public interface BedDao extends GenericDao<Bed> {
    Bed findByBedIdRoomName(Integer bedId, String roomName);

    List<Bed> getByDomId(String domId);

    void update(Bed bed);

    List<Bed> findAll();
}
