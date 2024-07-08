package Dao.Impl;

import Dao.DomResidentDao;
import Dao.GenericDao.Impl.GenericDaoImpl;
import Entity.DomResident;
import Mapper.DomResidentMap;

import java.util.List;

public class DomResidentDaoImpl extends GenericDaoImpl<DomResident> implements DomResidentDao  {
    @Override
    public DomResident findById(Integer id) {
        String sql = "SELECT * FROM DomResident WHERE residentId = ?";
        return query(sql, new DomResidentMap(), id).stream().findFirst().orElse(null);
    }

    @Override
    public DomResident findByRollIdAndSemester(String rollId, String semester) {
        System.out.println(rollId + semester);
        String sql = "SELECT * FROM DomResident WHERE rollId = ? AND termId = ?";
        return query(sql, new DomResidentMap(), rollId, semester).stream().findFirst().orElse(null);
    }

    @Override
    public void update(DomResident domResident) {
        String sql = "UPDATE DomResident SET userId = ?, bedId = ?, termId = ?, roomName = ?, rollId = ?, floor = ?, balance = ?, checkInDate = ?, checkOutDate = ? WHERE residentId = ?";
       update(sql, domResident.getUserId(), domResident.getBedId(), domResident.getTermId(), domResident.getRoomName(), domResident.getRollId(),
               domResident.getFloor(), domResident.getBalance(), domResident.getCheckInDate(), domResident.getCheckOutDate(), domResident.getResidentId());
    }

    @Override
    public List<DomResident> findAll() {
        String sql = "SELECT * FROM DomResident";
        return query(sql, new DomResidentMap());
    }

    @Override
    public List<DomResident> getByRollId(String rollId) {
        String sql = "SELECT * FROM DomResident WHERE rollId = ?";
        return query(sql, new DomResidentMap(), rollId);
    }

    @Override
    public int countUserInRoomAndTermAndYear(String room, String term, int year) {
        String sql = "  Select count(*) from DomResident where roomName = ? AND termId = ? AND YEAR(checkInDate) = ?";
        return count(sql,room, term, year);
    }
}
