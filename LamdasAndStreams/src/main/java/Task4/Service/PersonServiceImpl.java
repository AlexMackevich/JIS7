package Service;

import Model.Person;
import Model.Skill;
import Repository.Repository;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import static Repository.Repository.listOfPersons;

public class PersonServiceImpl implements PersonService {

    static {
        Repository repository = new Repository();
        repository.addPersonsToListOfPersons();
    }

    @Override
    public Person findPersonsWithNecessarySkillAndPercentage(String nameOfNecessarySkill) {
        var necessarySkill = findNecessarySkill(listOfPersons, nameOfNecessarySkill);
        return listOfPersons.stream()
                .filter(it -> it.getSkills().contains(necessarySkill))
                .findFirst().orElseThrow();
    }

    private Skill findNecessarySkill(List<Person> listOfPersons, String nameOfNecessarySkill){
        return Repository.listOfPersons.stream()
                .flatMap(it -> it.getSkills().stream())
                .filter(skill -> Objects.equals(skill.getNameOfSkill(), nameOfNecessarySkill))
                .max(Comparator.comparingInt(Skill::getSkillPercentage))
                .orElseThrow(IllegalArgumentException::new);
    }
}
