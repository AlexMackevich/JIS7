package ForthExampleFromArtemiy.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {

    private String name;
    private long levelOfStatus;
    private List<Skill> skills;

    public Person(String name, long levelOfStatus, Skill... skill) {
        this.name = name;
        this.levelOfStatus = levelOfStatus;
        this.skills = Arrays.asList(skill);
    }
}
