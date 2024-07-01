package Service.StudentService.StudentServiceImpl;

import Dao.StudentDao.Impl.ResidentRequestDaoImpl;
import Dao.StudentDao.ResidentRequestDao;
import Entity.DomResident;
import Service.StudentService.ResidentRequestService;

public class ResidentRequestServiceImpl implements ResidentRequestService {
    private final ResidentRequestDao residentRequestDao;

    public ResidentRequestServiceImpl(ResidentRequestDaoImpl residentRequestDaoImpl) {
        this.residentRequestDao = residentRequestDaoImpl;
    }


    @Override
    public DomResident findById(Integer id) {
        return residentRequestDao.findById(id);
    }

    @Override
    public long save(DomResident dom) {
        return residentRequestDao.save(dom);
    }
}
