package Dao.Impl;

import Dao.DomResidentDao;
import Dao.GenericDao.Impl.GenericDaoImpl;
import Entity.DomResident;
import Mapper.DomResidentMap;

import java.util.List;

public class DomResidentDaoImpl extends GenericDaoImpl<DomResident> implements DomResidentDao {
    @Override
    public DomResident findById(Integer id) {
        String sql = "SELECT * FROM DomResident WHERE residentId = ?";
        return query(sql, new DomResidentMap(), id).stream().findFirst().orElse(null);
    }

    @Override
    public DomResident findByRollIdAndSemesterAndYear(String rollId, String semester, int year) {
        String sql = "SELECT * FROM DomResident WHERE rollId = ? AND termId = ? AND year(checkInDate) = ?";
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
        String sql = "Select count(*) from DomResident where roomName = ? AND termId = ? AND YEAR(checkInDate) = ?";
        return count(sql, room, term, year);
    }

    @Override
    public List<DomResident> getByTermAndYear(String term, int year) {
        String sql = "  Select d.* from DomResident d join Student s ON d.rollId = s.rollId where d.termId = ? AND YEAR(d.checkInDate) = ? AND s.status = 'RESIDENT' ";
        return query(sql, new DomResidentMap(), term, year);
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
        return query(sql.toString(), new DomResidentMap(), term, year);
    }

    @Override
    public List<DomResident> getByPreMonthAndYear(int month, int year) {
        String sql = "Select * from DomResident where MONTH(checkInDate) = ? AND YEAR(checkInDate) = ?";
        return query(sql, new DomResidentMap(), month, year);
    }

    @Override
    public void save(DomResident domResident) {
        String sql = "INSERT INTO DomResident(floor, rollId, roomName, termId, bedId, balance, checkInDate, checkOutDate) VALUES(?,?,?,?,?,?,?,?)";
        insert(sql, domResident.getFloor(), domResident.getRollId(), domResident.getRoomName(), domResident.getTermId(),
                domResident.getBedId(), domResident.getBalance(), domResident.getCheckInDate(), domResident.getCheckOutDate());
    }
}
