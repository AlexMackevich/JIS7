package Service;

import Model.Student;

public interface StudentService {
    Object findByFullName(String firstname, String lastName);

    void setNewArgsInField(Student student, String firstName, String lastName, Integer age);
}
