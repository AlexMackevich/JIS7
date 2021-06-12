package ForthExampleFromArtemiy.Service;

import ForthExampleFromArtemiy.Model.Person;
import ForthExampleFromArtemiy.Model.Skill;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonServiceImpl implements PersonService {

    public List<Person> findPersonsWithSpecificSkillAndPercentage(Collection<Person> userList, String nameOfSkill, int percentageOfSkill) {

       return userList.stream()
                .filter(it -> it.getSkills().stream()
                        .anyMatch(skill -> skill.getNameOfSkill().equals(nameOfSkill) & skill.getSkillPercentage() > percentageOfSkill))
                .collect(Collectors.toList());
    }
}
