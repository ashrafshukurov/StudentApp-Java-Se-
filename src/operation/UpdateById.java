package operation;

import main.Student;
import sortings.SortingEnum;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UpdateById {
    public static void updateStudentById(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id that you want to update this student");
        int updateId = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Student student1 = list.get(i);
            if (student1.getId() == updateId) {
                System.out.println("update " + student1.getName() + " Information ");
                System.out.println("Which field you want to update");
                SortingEnum sortingEnum = SortingEnum.valueOf(sc.next().toUpperCase());
                switch (sortingEnum) {
                    case NAME:
                        System.out.println("Enter new name");
                        String newName = sc.next();
                        student1.setName(newName);
                        break;
                    case SURNAME:
                        System.out.println("Enter new Surname");
                        String newSurname = sc.next();
                        student1.setSurName(newSurname);
                        break;
                    case ADMISSION_DATE:
                        System.out.println("Enter new AdmissionDate");
                        LocalDate newAdmission_Date = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
                        student1.setAdmissionDate(newAdmission_Date);
                        break;
                    case BIRTHDATE:
                        System.out.println("Enter new BirthDate");
                        LocalDate newBirth_Date = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
                        student1.setBirthdate(newBirth_Date);
                        break;
                    case SCORE:
                        System.out.println("Enter new Score");
                        double newScore = sc.nextDouble();
                        student1.setScore(newScore);
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }
    }
}
