package operation;

import main.Student;

import java.util.Collections;
import java.util.List;

public class PrintStudent {
    public static void showStudentList(List<Student> list) {
        Collections.sort(list);
        if (list.isEmpty()) {
            System.out.println("your list is empty");
        }
        for (Student st1 : list) st1.printStudentInfo();
    }
}
