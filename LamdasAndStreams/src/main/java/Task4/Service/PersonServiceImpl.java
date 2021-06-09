package Service;

import Model.Person;
import Model.Skill;
import Repository.PersonRepository;

import java.util.Comparator;
import java.util.Objects;

import static Repository.Repository.listOfPersons;

public class PersonServiceImpl implements PersonService {

    static {
        PersonRepository.initPersonList();
    }

    @Override
    public Person findPersonWithNecessarySkill(String nameOfNecessarySkill) {
        var necessarySkill = findNecessarySkill(nameOfNecessarySkill);
        return personList.stream()
                .filter(it -> it.getSkill().contains(necessarySkill))
                .findFirst().orElseThrow();
    }

    private Skill findNecessarySkill(String nameOfNecessarySkill){
        return personList.stream()
                .flatMap(it -> it.getSkill().stream())
                .filter(skill -> Objects.equals(skill.getNameOfSkill(), nameOfNecessarySkill))
                .max(Comparator.comparing(Skill::getSkillPercentage))
                .orElseThrow(IllegalAccessError::new);
    }
}
