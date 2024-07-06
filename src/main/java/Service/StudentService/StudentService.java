package Service.StudentService;

import Entity.Student;

public interface StudentService {
    Student getByRollId(String rollId);
    Student getByGmail(String gmail);
}
