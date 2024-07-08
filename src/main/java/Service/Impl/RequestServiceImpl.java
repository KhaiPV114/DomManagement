package Service.Impl;

import Dao.Impl.ResidentRequestDaoImpl;
import Dao.ResidentRequestDao;
import Entity.Request;
import Service.RequestService;

import java.util.List;

public class RequestServiceImpl implements RequestService {
    private static ResidentRequestDao residentRequestDao = new ResidentRequestDaoImpl();

    @Override
    public List<Request> getAll() {
        return residentRequestDao.findAll();
    }
}
