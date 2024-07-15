package Dao;

import Dao.GenericDao.GenericDao;
import Dto.StudentBedDto;
import Entity.Student;
import Mapper.StudentBedDtoMap;

import java.util.List;

public interface StudentDao extends GenericDao<Student> {
    Student findById(String rollId);

    void update(Student Student);

    List<Student> findAll();

    Student findByGmail(String gmail);

    List<StudentBedDto> getByRoomNameAndSemesterAndYear(String roomName, String semester, int year);

    void updateStatus(String rollId, String status);

    void updateBalance(String rollId, Long balance);

    List<Student> getByDate();
}
