package Task6.Repository;

import Task6.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static final List<User> userList = new ArrayList<>();

    public static void initUserList() {
        userList.add(new User("Alex", "Matskevich", 15,
                "Alex_M", 1L, "irishman@gmail.com", "y2b9m1pn743", User.StatusOfUser.GUEST, true));
        userList.add(new User("Anton", "Duiskiy", 17,
                "A_Duisk", 2L, "DuiskiyA@mail.ru", "b9mEINgFhCG", User.StatusOfUser.GUEST, false));
        userList.add(new User("Boris", "Britva", 35,
                "Bullet-Dodger", 3L, "Bullet-Dodger@gmail.com", "Ws6V6xqZDNnF3eUOb06f", User.StatusOfUser.VIP_USER, false));
        userList.add(new User("Tom", "Hardy", 31,
                "Handsome_Bob", 4L, "Wanna_OneTwo@yahoo.com", "OneTwoMyLove", User.StatusOfUser.VIP_USER, true));
        userList.add(new User("Gerard", "Butler", 23,
                "Mr.OneTwo", 5L, "OneTwo_don't_gay@gmail.com", "Wanna_acCounter", User.StatusOfUser.USER, false));
        userList.add(new User("Idris", "Elba", 47,
                "Mr.Mumble", 6L, "irishman@gmail.com", "nlyCm8JTUqjgZTBZqQdT", User.StatusOfUser.GUEST, true));
        userList.add(new User("Micky", "Pierson", 42,
                "Lion", 7L, "LionKingOfJungle@yahoo.com", "", User.StatusOfUser.USER, false));
        userList.add(new User("Charly", "Hunnam", 41,
                "Reymondo", 8L, "BestmanOfLion@gmail.com", "WeEINgFhCGe1yWyiSag2", User.StatusOfUser.VIP_USER, true));
        userList.add(new User("Hugh", "Grant", 60,
                "Fletcherino", 9L, "AnyWayIWillShootYou@gmail.com", "", User.StatusOfUser.GUEST, true));
        userList.add(new User("Colin", "Farrell", 45,
                "Coach", 10L, "Coach@gmail.com", "8XCzc78Enxd4N8YRvh60", User.StatusOfUser.GUEST, false));
    }
}