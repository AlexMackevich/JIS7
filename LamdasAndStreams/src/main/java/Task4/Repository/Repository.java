package Repository;

import Model.Person;
import Model.Skill;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public static final List<Person> listOfPersons = new ArrayList<>();

    static Person person1 = new Person("Lokesh", 1L,
            new Skill("English", 10),
            new Skill("Kannada", 20),
            new Skill("Hindi", 10));

    static Person person2 = new Person("Mahesh", 2L,
            new Skill("English", 10),
            new Skill("Kannada", 30),
            new Skill("Hindi", 50));

    static Person person3 = new Person("Ganesh", 3L,
            new Skill("English", 10),
            new Skill("Kannada", 20),
            new Skill("Hindi", 40));

    static Person person4 = new Person("Ramesh", 4L,
            new Skill("English", 10),
            new Skill("Kannada", 20),
            new Skill("Hindi", 40));

    static Person person5 = new Person("Suresh", 5L,
            new Skill("English", 10),
            new Skill("Kannada", 40),
            new Skill("Hindi", 40));

    static Person person6 = new Person("Gnanesh", 6L,
            new Skill("English", 100),
            new Skill("Kannada", 20),
            new Skill("Hindi", 40));

    public void addPersonsToListOfPersons(){
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(person3);
        listOfPersons.add(person4);
        listOfPersons.add(person5);
        listOfPersons.add(person6);
    }
}
