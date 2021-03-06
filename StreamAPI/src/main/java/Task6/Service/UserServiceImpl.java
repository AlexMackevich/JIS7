package Task6.Service;

import Task6.Model.User;
import Task6.Repository.UserRepository;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static Task6.Model.User.StatusOfUser.*;

public class UserServiceImpl implements UserService{

    static {
        UserRepository.initUserList();
    }

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

    @Override
    public void sortedUserList(List<User> userList) {

        userList.stream()
                .peek(this::findUsersLessEighteen)
                .sorted(Comparator.comparing(User::getNickName))
                .forEach(System.out::println);
    }

    @Override
    public long counterOfUserGuestStatusAndActive(List<User> userList) {
        var filterUserList = findUsersWithStatusGuest(userList);
        return filterUserList.stream()
                .filter(it -> it.isActive())
                .count();
    }

    private void findUsersLessEighteen(User user) {
        if (user.getAge() < 18) {
            user.setStatusOfUser(GUEST);
            user.setActive(false);
        }
    }

    private List<User> findUsersWithStatusGuest(List<User> userList) {
        return userList.stream()
                .filter(it -> it.getStatusOfUser().equals(GUEST))
                .collect(Collectors.toList());
    }
}