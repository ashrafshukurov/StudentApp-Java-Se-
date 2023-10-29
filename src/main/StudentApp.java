package main;

import java.io.IOException;
import java.util.*;

import sortings.SortingEnum;
import operation.*;

public class StudentApp {
    public static void main(String[] args) throws IOException {
         List<Student>  list = new ArrayList<>();
        InitialAdd.defaultAdding(list);

        try {
            while (true) {
                System.out.println("1.Add Student" +
                        "\n2.Show All Students" +
                        "\n3.Sort and show all students" +
                        "\n4.Show Student by id" +
                        "\n5.Delete student by id" +
                        "\n6.Update Student by id" +
                        "\n7.Exit");
                Scanner sc = new Scanner(System.in);
                System.out.println("What you want to do Enter Operation");
                int menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        list.add(Add.fillStudent());
                        break;
                    case 2:
                        PrintStudent.showStudentList(list);
                        break;
                    case 3:
                        System.out.println("Enter Id,Name,Surname,Birthdate or AdmissionDate for Sorting");
                        SortAndShow.sortAndShowAllStudents(list, SortingEnum.valueOf(sc.next().toUpperCase()));
                        break;
                    case 4:
                        PrintById.showStudentById(list);
                        break;
                    case 5:
                        DeleteById.deleteStudentById(list);
                        break;
                    case 6:
                        UpdateById.updateStudentById(list);
                        break;
                    case 7:
                        System.exit(0);

                }
//                  WriteToFile.writeListToFile(list);
                WriteToJson.writingJson(list);
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter right Operation");
        }
    }
}
