package Service;

import Model.Student;

public interface StudentService {
    Student findByFullName(String firstname, String lastName);

    void setNewArgsInField(Student student, String firstName, String lastName, Integer age);
}
