package operation;

import main.Student;
import sortings.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAndShow {
    public static void sortAndShowAllStudents(List<Student> list, SortingEnum operation) {
        switch (operation) {
            case ID:
                SortingById sorting = new SortingById();
                Collections.sort(list, sorting);
                for (Student student1 : list) {
                    student1.printStudentInfo();
                }
                break;
            case NAME:
                SortingByName sortingByName = new SortingByName();
                Collections.sort(list, sortingByName);
                for (Student student1 : list) {
                    student1.printStudentInfo();
                }
                break;
            case SURNAME:
                SortingBySurname sortingBySurname = new SortingBySurname();
                Collections.sort(list, sortingBySurname);
                for (Student student1 : list) {
                    student1.printStudentInfo();
                }
                break;
            case BIRTHDATE:
                SortingByBirthDate sortingByBirthDate = new SortingByBirthDate();
                Collections.sort(list, sortingByBirthDate);
                for (Student student1 : list) {
                    student1.printStudentInfo();
                }
                break;
            case ADMISSION_DATE:
                SortingByAdmissionDate sortingByAdmissionDa = new SortingByAdmissionDate();



                Collections.sort(list, sortingByAdmissionDa);
                for (Student student1 : list) {
                    student1.printStudentInfo();
                }
                break;
            case SCORE:
                SortingByScore sortingByScore = new SortingByScore();
                Collections.sort(list, sortingByScore);
                for (Student student : list) {
                    student.printStudentInfo();
                }


        }

    }
}
