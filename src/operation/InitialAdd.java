package operation;

import main.Student;

import java.time.LocalDate;
import java.util.List;

public class InitialAdd {
    public static void defaultAdding(List<Student> list) {
        LocalDate localDate = LocalDate.of(2004, 2, 19);
        LocalDate admission = LocalDate.of(2020, 9, 13);
        Student student = new Student("Kamil", "Kamilov", 19, 524.3, localDate, admission);
        LocalDate localDate1 = LocalDate.of(2000, 3, 11);
        LocalDate admission1 = LocalDate.of(2017, 5, 18);
        Student student1 = new Student("Ali", "Aliyev", 23, 556, localDate1, admission1);
        LocalDate localDate2 = LocalDate.of(1998, 3, 22);
        LocalDate admission2 = LocalDate.of(2011, 4, 26);
        Student student2 = new Student("Feqan", "Ehmedov", 26, 236.7, localDate2, admission2);
        LocalDate localDate3 = LocalDate.of(1982, 3, 14);
        LocalDate admission3 = LocalDate.of(2000, 5, 15);
        Student student3 = new Student("Kenan", "Ismayilov", 41, 498, localDate3, admission3);
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
    }
}
