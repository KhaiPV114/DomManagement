package Service.Impl;

import Dao.BedDao;
import Dao.Impl.BedDaoImpl;
import Entity.Bed;
import Service.BedService;

import java.util.List;

public class BedServiceImpl implements BedService {

    private final BedDao bedDao = new BedDaoImpl();
    @Override
    public List<Bed> getAll() {
        return bedDao.findAll();
    }

    @Override
    public List<Bed> getByDomId(String domId) {
        return bedDao.getByDomId(domId);
    }

    @Override
    public List<Bed> getByRoomType(String type) {
        return bedDao.getByRoomType(type);
    }

    @Override
    public Bed getByBedAndRoomName(Integer bedId, String roomName) {
        return bedDao.findByBedIdRoomName(bedId, roomName);
    }
}
