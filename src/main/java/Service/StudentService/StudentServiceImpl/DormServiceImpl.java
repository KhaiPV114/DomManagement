package Service.StudentService.StudentServiceImpl;

import Dao.StudentDao.DormDao;
import Dao.StudentDao.Impl.DormDaoImpl;
import Entity.Dorm;
import Service.StudentService.DormService;

import java.util.List;

public class DormServiceImpl implements DormService {

    private final DormDao dormDao = new DormDaoImpl();
    public DormServiceImpl() {
    }

    @Override
    public Dorm findById(Integer id) {
        return dormDao.findById(id);
    }

    @Override
    public List<Dorm> getAll() {
        return dormDao.findAll();
    }
}
