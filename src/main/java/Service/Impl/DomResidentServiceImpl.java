package Service.Impl;

import Dao.DomResidentDao;
import Dao.Impl.DomResidentDaoImpl;
import Entity.DomResident;
import Service.DomResidentService;

import java.util.List;

public class DomResidentServiceImpl implements DomResidentService {
    private final DomResidentDao domResidentDao = new DomResidentDaoImpl();
    @Override
    public DomResident getById(Integer id) {
        return domResidentDao.findById(id);
    }

    @Override
    public List<DomResident> getByRollId(String rollId) {
        return domResidentDao.getByRollId(rollId);
    }

    @Override
    public DomResident getByRollIdAndSemester(String rollId, String semester) {
        return domResidentDao.findByRollIdAndSemester(rollId, semester);
    }
}
