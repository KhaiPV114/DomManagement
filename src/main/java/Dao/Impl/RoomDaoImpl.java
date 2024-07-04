package Dao.Impl;

import Dao.GenericDao.Impl.GenericDaoImpl;
import Dao.RoomDao;
import Entity.Room;
import Mapper.RoomMap;

import java.util.List;

public class RoomDaoImpl extends GenericDaoImpl<Room> implements RoomDao {
    @Override
    public Room findById(String roomName) {
        String sql = "SELECT * FROM Room WHERE roomName = ?";
        return query(sql, new RoomMap(), roomName).stream().findFirst().orElse(null);
    }

    @Override
    public void update(Room room) {
        String sql = "UPDATE Room SET roomType = ?, roomStatus = ?, floor = ?, domId = ?, price = ? WHERE roomName = ?";
        update(sql, room.getRoomType(), room.getRoomStatus(), room.getFloor(), room.getDomId(), room.getPrice(), room.getRoomName());
    }

    @Override
    public List<Room> findAll() {
        String sql = "SELECT * FROM Room";
        return query(sql, new RoomMap());
    }
}
