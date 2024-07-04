package Service.StudentService.Impl;

import Dao.BedDao;
import Dao.Impl.BedDaoImpl;
import Entity.Bed;
import Service.StudentService.BedService;

import java.util.List;

public class BedServiceImpl implements BedService {

    private final BedDao bedDao = new BedDaoImpl();
    @Override
    public List<Bed> getAll() {
        return bedDao.findAll();
    }
}
