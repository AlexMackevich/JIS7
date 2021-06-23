package Task4.Repository;

import Task4.Model.Person;
import Task4.Model.Skill;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    public static final List<Person> personList = new ArrayList<>();

    public static void initPersonList() {
        personList.add(new Person("Lokesh", 1L,
                new Skill("English", 10),
                new Skill("Kannada", 20),
                new Skill("Hindi", 10)));

        personList.add(new Person("Mahesh", 2L,
                new Skill("English", 10),
                new Skill("Kannada", 30),
                new Skill("Hindi", 50)));

        personList.add(new Person("Ganesh", 3L,
                new Skill("English", 10),
                new Skill("Kannada", 20),
                new Skill("Hindi", 40)));

        personList.add(new Person("Ramesh", 4L,
                new Skill("English", 10),
                new Skill("Kannada", 20),
                new Skill("Hindi", 40)));

        personList.add(new Person("Suresh", 5L,
                new Skill("English", 10),
                new Skill("Kannada", 40),
                new Skill("Hindi", 40)));

        personList.add(new Person("Gnanesh", 6L,
                new Skill("English", 100),
                new Skill("Kannada", 20),
                new Skill("Hindi", 40)));
    }
}
