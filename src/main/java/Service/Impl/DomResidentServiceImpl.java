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
    public DomResident getByRollIdAndSemesterAndYear(String rollId, String semester, int year) {
        return domResidentDao.findByRollIdAndSemesterAndYear(rollId, semester, year);
    }

    @Override
    public List<DomResident> getBySemesterAndYear(String semester, int year) {
        return domResidentDao.getByTermAndYear(semester, year);
    }

    @Override
    public int countUserInRoomAndTermAndYear(String room, String term, int year) {
        return domResidentDao.countUserInRoomAndTermAndYear(room, term, year);
    }

    @Override
    public List<DomResident> getByListRollIdAndTermAndYear(List<String> rollIds, String term, int year) {
        return domResidentDao.getByListRollIdAndTermAndYear(rollIds, term, year);
    }

    @Override
    public List<DomResident> getByPrevMonthAndYear(int month, int year) {
        return domResidentDao.getByPreMonthAndYear(month, year);
    }
}
