package Service;

import Model.User;

import java.util.Collection;
import java.util.List;

public interface UserService {

    void setUserStatusAndActivity(Collection<User> userList);

    void sortedUserList(List<User> userList);

}
