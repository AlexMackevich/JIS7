import Service.PersonServiceImpl;

public class App {

    public static void main(String[] args) {
        PersonServiceImpl personService = new PersonServiceImpl();

        System.out.println(personService.findPersonWithNecessarySkill("English"));
        System.out.println("___________________");
        System.out.println(personService.findPersonWithNecessarySkill("Kannada"));
        System.out.println("___________________");
    }
}
