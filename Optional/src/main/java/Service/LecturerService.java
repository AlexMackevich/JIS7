package Service;

import Model.Lecturer;
import Model.Student;

public interface LecturerService {

    Object findByFullName(String firstName, String lastName);

    void setStudentWithCheckOnNullFields(Lecturer lecturer, Student student);
}
