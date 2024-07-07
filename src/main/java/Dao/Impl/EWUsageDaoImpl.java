package Dao.Impl;

import Dao.EWUsageDao;
import Dao.GenericDao.Impl.GenericDaoImpl;
import Entity.ElectricWaterUsage;
import Mapper.ElectricWaterUsageMap;

import java.util.List;

public class EWUsageDaoImpl extends GenericDaoImpl<ElectricWaterUsage> implements EWUsageDao {
    @Override
    public List<ElectricWaterUsage> getByRoomNameAndYearAndTerm(String roomName, int year, String term) {
       String sql = "SELECT * FROM ElectricWater WHERE room = ? AND year = ? AND term = ?";
        return query(sql, new ElectricWaterUsageMap(), roomName, year, term);
    }
}
