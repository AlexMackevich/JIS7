package ForthExampleFromArtemiy.Service;

import ForthExampleFromArtemiy.Model.Person;
import ForthExampleFromArtemiy.Model.Skill;

import java.util.Collection;
import java.util.List;

public interface PersonService {

    List<Person> findPersonsWithSpecificSkillAndPercentage(Collection<Person> userList, String name, int percentageOfSkill);

}
