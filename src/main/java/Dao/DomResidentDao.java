package Dao;

import Dao.GenericDao.GenericDao;
import Entity.Dom;
import Entity.DomResident;

import java.util.List;

public interface DomResidentDao extends GenericDao<DomResident> {
    DomResident findById(Integer id);
    DomResident findByRollIdAndSemester(String rollId, String semester);

    void update(DomResident domResident);

    List<DomResident> findAll();

    List<DomResident> getByRollId(String rollId);

    int countUserInRoomAndTermAndYear(String room, String term, int year);
}
