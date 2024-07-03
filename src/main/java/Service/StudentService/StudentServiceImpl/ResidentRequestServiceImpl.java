package Service.StudentService.StudentServiceImpl;

import Dao.StudentDao.Impl.ResidentRequestDaoImpl;
import Dao.StudentDao.ResidentRequestDao;
import Entity.Request;
import Service.StudentService.ResidentRequestService;

import java.util.List;

public class ResidentRequestServiceImpl implements ResidentRequestService {
    private final ResidentRequestDao residentRequestDao = new ResidentRequestDaoImpl();

    @Override
    public Request findById(Integer id) {
       return residentRequestDao.findById(id)    ;
    }

    @Override
    public long createNewRequest(Request request) {
        return residentRequestDao.createNewRequest(request);
    }

    @Override
    public void update(Request request) {
        residentRequestDao.update(request);
    }

    @Override
    public List<Request> findAll() {
        return residentRequestDao.findAll();
    }


}
