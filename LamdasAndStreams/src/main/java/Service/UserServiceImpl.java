package Service;

import Model.User;

import java.util.Collection;

import static Model.User.StatusOfUser.*;

public class UserServiceImpl implements UserService {

    @Override
    public void setUserStatusAndActivity(Collection<User> userList) {
        userList.stream()
                .forEach(it -> {
                    if (it.getStatusOfUser().equals(GUEST)) {
                        it.setStatusOfUser(USER);
                        it.setActive(true);
                    } else if (it.getStatusOfUser().equals(USER) & it.isActive()) {
                        it.setStatusOfUser(VIP_USER);
                    }
                });
    }

}
