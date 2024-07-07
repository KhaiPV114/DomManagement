package Dao;

import Dao.GenericDao.GenericDao;
import Entity.Request;
import Entity.Users;

import java.util.List;

public interface UsersDao extends GenericDao<Users> {
    Users findById(Integer id);
    Users getByGmail(String gmail);

    void update (Users Users);

    List<Users> findAll();
}
