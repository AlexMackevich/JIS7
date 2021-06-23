package Task4.Service;

import Task4.Model.Person;
import Task4.Model.Skill;
import Task4.Repository.PersonRepository;

import java.util.Comparator;
import java.util.Objects;

import static Task4.Repository.PersonRepository.personList;

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