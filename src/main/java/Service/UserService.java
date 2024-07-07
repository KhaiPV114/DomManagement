package Service;



import Entity.Users;

import java.util.List;

public interface UserService {
    List<Users> getALl();
    Users getByGmail(String gmail);
}
