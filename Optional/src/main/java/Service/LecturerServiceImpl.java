package Service;

import Exceptions.FindNameException;
import Exceptions.IfNullField;
import Model.Lecturer;
import Model.Student;
import Repository.LecturerRepository;

import java.util.Optional;

import static Repository.LecturerRepository.lecturerList;

public class LecturerServiceImpl implements LecturerService {

    static {
        LecturerRepository.initStudentList();
    }

    @Override
    public void setStudentWithCheckOnNullFields(Lecturer lecturer, Student student) {
        Optional.of(student).stream()
                .filter(it -> it.getFirstName() != null && it.getLastName() != null && it.getAge() != null)
                .findFirst()
                .orElseThrow(() -> new IfNullField("Some field has Null"));
        lecturer.getStudentList().add(student);
    }

    @Override
    public Lecturer findByFullName(String firstName, String lastName) {
        return lecturerList.stream()
                .filter(it -> it.getFirstName().equals(firstName) & it.getLastName().equals(lastName))
                .findFirst()
                .orElseThrow(() -> new FindNameException("This Lecturer doesn't exist"));
    }
}