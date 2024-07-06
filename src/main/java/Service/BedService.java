package Service;

import Entity.Bed;

import java.util.List;

public interface BedService {
    List<Bed> getAll();
    List<Bed> getByDomId(String domId);

    List<Bed> getByRoomType(String type);
}
