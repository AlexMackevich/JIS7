package Task6.Service;

import Task6.Model.User;

import java.util.Collection;
import java.util.List;

public interface UserService {

    void setUserStatusAndActivity(Collection<User> userList);

    void sortedUserList(List<User> userList);

    long counterOfUserGuestStatusAndActive(List<User> userList);
}
