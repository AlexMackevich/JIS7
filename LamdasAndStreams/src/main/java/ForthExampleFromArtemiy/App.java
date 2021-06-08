package ForthExampleFromArtemiy;

import ForthExampleFromArtemiy.Model.Skill;
import ForthExampleFromArtemiy.Model.Person;
import ForthExampleFromArtemiy.Service.PersonServiceImpl;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        Person person1 = new Person("Lokesh", 1L,
                new Skill("English", 10),
                new Skill("Kannada", 20),
                new Skill("Hindi", 10));

        Person person2 = new Person("Mahesh", 2L,
                new Skill("English", 10),
                new Skill("Kannada", 30),
                new Skill("Hindi", 50));

        Person person3 = new Person("Ganesh", 3L,
                new Skill("English", 10),
                new Skill("Kannada", 20),
                new Skill("Hindi", 40));

        Person person4 = new Person("Ramesh", 4L,
                new Skill("English", 10),
                new Skill("Kannada", 20),
                new Skill("Hindi", 40));

        Person person5 = new Person("Suresh", 5L,
                new Skill("English", 10),
                new Skill("Kannada", 40),
                new Skill("Hindi", 40));

        Person person6 = new Person("Gnanesh", 6L,
                new Skill("English", 100),
                new Skill("Kannada", 20),
                new Skill("Hindi", 40));

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        PersonServiceImpl personService = new PersonServiceImpl();

        var personsWithSpecificSkillAndPercentage = personService.findPersonsWithSpecificSkillAndPercentage(persons, "English", 50);

        if (personsWithSpecificSkillAndPercentage.isEmpty()){
            System.out.println(personService.findPersonsWithSpecificSkillAndPercentage(persons, "Kannada", 30));
        } else System.out.println("Persons, which you try to find - didn't exist");
    }
}
