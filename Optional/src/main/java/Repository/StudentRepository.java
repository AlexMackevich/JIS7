package Repository;

import Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    public static final List<Student> studentList = new ArrayList<>();

    public static void initStudentList() {
        studentList.add(new Student("Alex", "Matskevich", 28));
        studentList.add(new Student("Katya", "Bulova", null));
        studentList.add(new Student("Vlad", "kalyada", 26));
        studentList.add(new Student("Alex", "Tulai", null));
        studentList.add(new Student("Vitya", null, 24));
        studentList.add(new Student(null, "Usenkov", 26));
        studentList.add(new Student(null, null, null));

    }
}
