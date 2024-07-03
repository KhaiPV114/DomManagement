package Service.StudentService;

import Entity.Dorm;

import java.util.List;

public interface DormService {
    Dorm findById(Integer id);
    List<Dorm> getAll();
}
