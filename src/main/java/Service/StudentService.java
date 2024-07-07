package Service;

import Entity.Student;

import java.util.List;

public interface StudentService {
    Student getByRollId(String rollId);
    Student getByGmail(String gmail);
    List<Student> getAll();
}
