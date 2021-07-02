package Service;

import Exceptions.FindNameException;
import Exceptions.IfNullField;
import Model.Student;
import Repository.StudentRepository;

import java.util.Optional;

import static Repository.StudentRepository.studentList;

public class StudentServiceImpl implements StudentService {
    static {
        StudentRepository.initStudentList();
    }

    @Override
    public Student findByFullName(String firstName, String lastName) {
        return studentList.stream()
                .filter(it -> it.getFirstName().equals(firstName) & it.getLastName().equals(lastName))
                .findFirst()
                .orElseThrow(() -> new LecturerNotFoundException("This student doesn't exist"));
    }

    @Override
    public void updateStudent(Student student, String firstName, String lastName, Integer age) {
        Optional.of(student).ifPresent(it -> {
            if (hasNotNullParameters(firstName, lastName, age)){
                it.setFirstName(firstName);
                it.setLastName(lastName);
                it.setAge(age);
            } else new NullFieldException("Some field has Null");
        });
    }

    private boolean hasNotNullParameters(String firstName, String lastName, Integer age){
        return nonNull(firstName) && nonNull(lastName) && nonNull(age);
    }
}
