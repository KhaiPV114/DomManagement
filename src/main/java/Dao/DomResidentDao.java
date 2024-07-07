package Dao;

import Dao.GenericDao.GenericDao;
import Entity.Dom;
import Entity.DomResident;

import java.util.List;

public interface DomResidentDao extends GenericDao<DomResident> {
    DomResident findById(Integer id);

    void update(DomResident domResident);

    List<DomResident> findAll();

    List<DomResident> getByRollId(String rollId);
}
