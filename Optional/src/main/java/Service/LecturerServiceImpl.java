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
    public void addStudentToLecturer(Lecturer lecturer, Student student) {
        Optional.of(student).stream()
                .filter(it -> checkOnNullParameter(student))
                .findFirst()
                .orElseThrow(() -> new NullFieldException("Some field has Null"));
        lecturer.getStudentList().add(student);
    }

    @Override
    public Lecturer findByFullName(String firstName, String lastName) {
        return lecturerList.stream()
                .filter(it -> it.getFirstName().equals(firstName) & it.getLastName().equals(lastName))
                .findFirst()
                .orElseThrow(() -> new LecturerNotFoundException("This Lecturer doesn't exist"));
    }
    private boolean checkOnNullParameter (Student student){
        return nonNull(student.getFirstName()) && nonNull(student.getLastName()) && nonNull(student.getAge());
    }
}
