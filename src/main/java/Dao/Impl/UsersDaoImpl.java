package Dao.Impl;

import Dao.GenericDao.Impl.GenericDaoImpl;
import Dao.UsersDao;
import Entity.Users;
import Mapper.UsersMap;

import java.util.List;

public class UsersDaoImpl extends GenericDaoImpl<Users> implements UsersDao {

    @Override
    public Users findById(Integer id) {
        String sql = "SELECT * FROM Users WHERE userId =?";
        return query(sql, new UsersMap(), id).stream().findFirst().orElse(null);
    }

    @Override
    public void update(Users users) {
        String sql = "UPDATE Users SET gmail = ?, password = ?, roleId = ?, gender = ?, fullName = ? WHERE userId = ?";
        update(sql, users.getGmail(), users.getPassword(), users.getRoleId(), users.getGender(), users.getFullName(), users.getUserId());
    }

    @Override
    public List<Users> findAll() {
        String sql = "SELECT * FROM Users";
        return query(sql, new UsersMap());
    }
}
