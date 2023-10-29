package operation;

import main.Student;

import java.util.List;
import java.util.Scanner;

public class DeleteById {
    public static void deleteStudentById(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id that you want to delete this student");
        int deleteId = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == deleteId) {
                var s = list.get(i);
                list.remove(s);
                System.out.println(s.getName() + " is deleted");
            }
        }
    }
}
