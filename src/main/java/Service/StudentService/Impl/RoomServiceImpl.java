package Service.StudentService.Impl;

import Dao.Impl.RoomDaoImpl;
import Dao.RoomDao;
import Entity.Room;
import Service.StudentService.RoomService;

import java.util.List;

public class RoomServiceImpl implements RoomService {
    private final RoomDao roomDao = new RoomDaoImpl();
    @Override
    public List<Room> getAll() {
        return roomDao.findAll();
    }
}
