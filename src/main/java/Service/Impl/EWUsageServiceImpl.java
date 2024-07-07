package Service.Impl;

import Dao.EWUsageDao;
import Dao.Impl.EWUsageDaoImpl;
import Entity.ElectricWaterUsage;
import Service.EWUsageService;

import java.util.List;

public class EWUsageServiceImpl implements EWUsageService {
    private final EWUsageDao ewUsageDao = new EWUsageDaoImpl();

    @Override
    public List<ElectricWaterUsage> getByRoomNameAndYearAndTerm(String roomName, int year, String term) {
        return ewUsageDao.getByRoomNameAndYearAndTerm(roomName, year, term);
    }
}
