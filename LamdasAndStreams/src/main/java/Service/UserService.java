package Service;

import Model.User;

import java.util.Collection;

public interface UserService {

    void setUserStatusAndActivity(Collection<User> userList);

}
