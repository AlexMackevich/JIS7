package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private long lvlOfStatus;
    private List<Skill> skill;

    public Person(String name, long lvlOfStatus, Skill... skill) {
        this.name = name;
        this.lvlOfStatus = lvlOfStatus;
        this.skill = Arrays.asList(skill);
    }
}
