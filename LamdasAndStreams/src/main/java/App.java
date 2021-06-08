
import Model.User;
import Service.UserServiceImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        User user1 = new User("Alex", "Matskevich", 15,
                "Alex_M", 1L, "irishman@gmail.com", "y2b9m1pn743", User.StatusOfUser.GUEST, true);
        User user2 = new User("Anton", "Duiskiy", 17,
                "A_Duisk", 2L, "DuiskiyA@mail.ru", "b9mEINgFhCG", User.StatusOfUser.GUEST, false);
        User user3 = new User("Boris", "Britva", 35,
                "Bullet-Dodger", 3L, "Bullet-Dodger@gmail.com", "Ws6V6xqZDNnF3eUOb06f", User.StatusOfUser.VIP_USER, false);
        User user4 = new User("Tom", "Hardy", 31,
                "Handsome_Bob", 4L, "Wanna_OneTwo@yahoo.com", "OneTwoMyLove", User.StatusOfUser.VIP_USER, true);
        User user5 = new User("Gerard", "Butler", 23,
                "Mr.OneTwo", 5L, "OneTwo_don't_gay@gmail.com", "Wanna_acCounter", User.StatusOfUser.USER, false);
        User user6 = new User("Idris", "Elba", 47,
                "Mr.Mumble", 6L, "irishman@gmail.com", "nlyCm8JTUqjgZTBZqQdT", User.StatusOfUser.GUEST, true);
        User user7 = new User("Micky", "Pierson", 42,
                "Lion", 7L, "LionKingOfJungle@yahoo.com", "", User.StatusOfUser.USER, false);
        User user8 = new User("Charly", "Hunnam", 41,
                "Reymondo", 8L, "BestmanOfLion@gmail.com", "WeEINgFhCGe1yWyiSag2", User.StatusOfUser.VIP_USER, true);
        User user9 = new User("Hugh", "Grant", 60,
                "Fletcherino", 9L, "AnyWayIWillShootYou@gmail.com", "", User.StatusOfUser.GUEST, true);
        User user10 = new User("Colin", "Farrell", 45,
                "Coach", 10L, "Coach@gmail.com", "8XCzc78Enxd4N8YRvh60", User.StatusOfUser.GUEST, false);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);

        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserStatusAndActivity(userList);
        userList.forEach(System.out::println);
        System.out.println("_______________");

        userService.sortedUserList(userList);
    }
}
