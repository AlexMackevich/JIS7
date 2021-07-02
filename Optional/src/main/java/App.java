import Service.LecturerServiceImpl;
import Service.StudentServiceImpl;

public class App {

    public static void main(String[] args){

        LecturerServiceImpl lecturerAndStudentService = new LecturerServiceImpl();
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl();

        var lecturer1 = lecturerAndStudentService.findByFullName("Art", "Stankevich");
        var student1 = studentServiceImpl.findByFullName("Alex", "Matskevich");

        lecturerAndStudentService.setStudentWithCheckOnNullFields(lecturer1, student1);
        System.out.println(lecturer1);

        studentServiceImpl.setNewArgsInField(student1,null, null, null);
        System.out.println(student1);
    }
}