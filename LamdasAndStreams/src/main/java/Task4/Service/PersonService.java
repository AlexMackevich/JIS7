package Service;

import Model.Person;
import java.util.Collection;
import java.util.List;

public interface PersonService {

    Person findPersonsWithNecessarySkillAndPercentage(String name);
}
