package Dao.Impl;

import Dao.BedDao;
import Dao.GenericDao.Impl.GenericDaoImpl;
import Entity.Bed;
import Mapper.BedMap;

import java.util.List;

public class BedDaoImpl extends GenericDaoImpl<Bed> implements BedDao {


    @Override
    public Bed findByBedIdRoomName(Integer bedId, String roomName) {
        String sql = "SELECT * FROM Bed WHERE bedId = ? AND roomName = ?";
        return query(sql, new BedMap(), bedId, roomName).stream().findFirst().orElse(null);
    }

    @Override
    public List<Bed> getByDomId(String domId) {
        String param = domId + "%";
        String sql = "SELECT * FROM Bed WHERE roomName LIKE ?";
        return query(sql, new BedMap(), param);
    }

    @Override
    public void update(Bed bed) {
        String sql = "UPDATE Bed SET bedStatus = ? WHERE bedId = ? AND roomName = ?";
        update(sql, bed.getBedStatus().toString(), bed.getBedId(), bed.getRoomName());
    }

    @Override
    public List<Bed> findAll() {
        String sql = "SELECT * FROM Bed";
        return query(sql, new BedMap());
    }

    @Override
    public List<Bed> getByRoomTypeAndGender(String type, String gender) {
        String sql = "SELECT * FROM Bed b JOIN Room r ON b.roomName = r.roomName JOIN Dom d ON r.domId = d.domId WHERE r.roomType = ? AND d.domGender = ?";
        return query(sql, new BedMap(), type, gender);
    }

    @Override
    public Bed getRandomByFloorAndDomName(int floor, String domName) {
        String sql = "SELECT * FROM Bed b JOIN Room r ON r.roomName = b.roomName JOIN Dom d ON d.domId = r.domId WHERE b.floor = ? AND b.bedStatus = 'NOTAVAILABLE' AND d.domName = ?";
        return query(sql, new BedMap(), floor, domName).stream().findFirst().orElse(null);
    }
}
