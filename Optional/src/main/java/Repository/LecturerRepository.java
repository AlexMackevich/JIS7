package Repository;

import Model.Lecturer;

import java.util.ArrayList;
import java.util.List;

public class LecturerRepository {
    public static final List<Lecturer> lecturerList = new ArrayList<>();

    public static void initStudentList(){

        lecturerList.add(new Lecturer("Art","Stankevich", 26, new ArrayList<>()));
        lecturerList.add(new Lecturer("Max","Shelkovich", 33, new ArrayList<>()));
        lecturerList.add(new Lecturer("Anton","Kupriyanchik", 22, new ArrayList<>()));
        lecturerList.add(new Lecturer("Evgeniy","Kuznecov", 35, new ArrayList<>()));
    }
}
