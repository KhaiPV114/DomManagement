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
    public DomResident findByRollIdAndSemesterAndYear(String rollId, String semester, int year) {
        String sql = "SELECT * FROM DomResident WHERE rollId = ? AND termId = ? AND year = ?";
        return query(sql, new DomResidentMap(), rollId, semester, year).stream().findFirst().orElse(null);
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

    @Override
    public List<DomResident> getByListRollIdAndTermAndYear(List<String> rollIds, String term, int year) {
        StringBuilder sql = new StringBuilder("SELECT * FROM DomResident WHERE rollId IN (");
        for (int i = 0; i < rollIds.size(); i++) {
            sql.append("'").append(rollIds.get(i)).append("'");
            if (i != rollIds.size() - 1) {
                sql.append(",");
            }
        }
        sql.append(") AND termId = ? AND year(checkInDate) = ?");
        System.out.println(sql.toString());
        return query(sql.toString(),new DomResidentMap(), term, year);
    }
}
