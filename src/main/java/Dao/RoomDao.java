package Dao;

import Dao.GenericDao.GenericDao;
import Entity.Room;

import java.util.List;

public interface RoomDao extends GenericDao<Room> {
    Room findById(String roomName);

    void update(Room Room);

    List<Room> findAll();
}
