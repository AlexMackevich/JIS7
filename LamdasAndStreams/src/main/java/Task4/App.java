import Service.PersonServiceImpl;

public class App {

    public static void main(String[] args) {

        PersonServiceImpl personService = new PersonServiceImpl();
        System.out.println(personService.findPersonsWithNecessarySkillAndPercentage("English"));
        System.out.println("___________________");
        System.out.println(personService.findPersonsWithNecessarySkillAndPercentage("Kannada"));
        System.out.println("___________________");
    }
}
