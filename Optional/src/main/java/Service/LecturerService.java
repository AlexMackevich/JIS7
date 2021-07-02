package Service;

import Model.Lecturer;
import Model.Student;

public interface LecturerService {

    Lecturer findByFullName(String firstName, String lastName);

    void addStudentToLecturer(Lecturer lecturer, Student student);
}
