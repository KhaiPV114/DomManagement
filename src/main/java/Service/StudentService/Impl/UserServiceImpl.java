package Service.StudentService.Impl;

import Dao.Impl.UsersDaoImpl;
import Dao.UsersDao;
import Entity.Users;
import Service.StudentService.UserService;
import com.google.api.services.drive.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UsersDao usersDao = new UsersDaoImpl();

    @Override
    public List<Users> getALl() {
        List<Users> userList = usersDao.findAll();
        return userList;
    }
}
