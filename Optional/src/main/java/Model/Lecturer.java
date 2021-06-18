package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lecturer {

    private String firstName;
    private String lastName;
    private int age;
    private List<Student> studentList;
}