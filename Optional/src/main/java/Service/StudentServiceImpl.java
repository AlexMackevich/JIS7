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
                .orElseThrow(() -> new FindNameException("This student doesn't exist"));
    }

    @Override
    public void setNewArgsInField(Student student, String firstName, String lastName, Integer age) {
        Optional.of(student).ifPresent(it -> {
            if (firstName != null && lastName != null && age != null){
                it.setFirstName(firstName);
                it.setLastName(lastName);
                it.setAge(age);
            } else new IfNullField("Some field has Null");
        });
    }
}