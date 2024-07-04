package Dao.Impl;

import Dao.BedDao;
import Dao.GenericDao.Impl.GenericDaoImpl;
import Entity.Bed;
import Mapper.BedMap;

import java.util.List;

public class BedDaoImpl extends GenericDaoImpl<Bed> implements BedDao {


    @Override
    public Bed findById(Integer id) {
        String sql = "SELECT * FROM Bed WHERE bedId = ?";
        return query(sql, new BedMap(), id).stream().findFirst().orElse(null);
    }

    @Override
    public void update(Bed bed) {
        String sql = "UPDATE Bed SET roomName = ? , floor = ? , bedStatus = ? WHERE bedId = ?";
        update(sql, bed.getRoomName(), bed.getFloor(), bed.getBedStatus().toString() , bed.getBedId());
    }

    @Override
    public List<Bed> findAll() {
        String sql = "SELECT * FROM Bed";
        return query(sql, new BedMap());
    }
}
