package Dao;

import Dao.GenericDao.GenericDao;
import Entity.ElectricWaterUsage;

import java.util.List;

public interface EWUsageDao extends GenericDao<ElectricWaterUsage> {
    List<ElectricWaterUsage> getByRoomNameAndYearAndTerm(String roomName, int year, String term);
}
