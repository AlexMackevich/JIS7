package Task6;

import Task6.Service.UserServiceImpl;

import static Task6.Repository.UserRepository.userList;

public class App {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserStatusAndActivity(userList);
        userList.forEach(System.out::println);
        System.out.println("_______________");

        userService.sortedUserList(userList);
        System.out.println("_______________");

        System.out.println(userService.counterOfUserGuestStatusAndActive(userList));
        System.out.println("_______________");

    }
}
