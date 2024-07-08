package Service;

import Entity.Bed;

import java.util.List;

public interface BedService {
    List<Bed> getAll();

    List<Bed> getByDomId(String domId);

    List<Bed> getByRoomTypeAndGender(String type, String gender);

    Bed getByBedAndRoomName(Integer bedId, String roomName);

    Bed randomBedByFloorAndDomName(int floor, String domName);

    void updateStatus(Bed bed);
}
