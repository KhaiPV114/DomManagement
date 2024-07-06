package Dao;

import Dao.GenericDao.GenericDao;
import Entity.Student;

import java.util.List;

public interface StudentDao extends GenericDao<Student> {
    Student findById(String rollId);

    void update(Student Student);

    List<Student> findAll();

    Student findByGmail(String gmail);
}
