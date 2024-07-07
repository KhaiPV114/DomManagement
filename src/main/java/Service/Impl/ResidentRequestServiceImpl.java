package Service.Impl;

import Dao.Impl.ResidentRequestDaoImpl;
import Dao.ResidentRequestDao;
import Entity.Request;
import Service.ResidentRequestService;

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

    @Override
    public List<Request> getByRollId(String rollId) {
        return residentRequestDao.getByRollId(rollId);
    }

    @Override
    public void createRequestBookRoom(Request request) {
         residentRequestDao.createRequestBookRoom(request);
    }

    @Override
    public void createRequestOther(Request request) {
        if(request.getCheckOutDate() == null) {
            System.out.println("other");
            residentRequestDao.createRequestOther(request);
        }else {
            System.out.println("Checkout");
            residentRequestDao.createRequestCheckOut(request);
        }
    }


}