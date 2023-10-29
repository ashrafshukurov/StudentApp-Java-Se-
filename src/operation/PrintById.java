package operation;

import main.Student;

import java.util.List;
import java.util.Scanner;

public class PrintById {
    public static void showStudentById(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id that you are looking for Student");
        int searchingId = sc.nextInt();
        for (Student student : list) {
            if (student.getId() == searchingId) student.printStudentInfo();
            else {
                System.out.println("You dont have Student such as this id");
            }
        }
    }
}
