package Service;

import Entity.ElectricWaterUsage;

import java.util.List;

public interface EWUsageService {
    List<ElectricWaterUsage> getByRoomNameAndYearAndTerm(String roomName, int year, String term);
}
