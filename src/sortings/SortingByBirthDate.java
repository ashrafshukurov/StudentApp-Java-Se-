package sortings;

import main.Student;

import java.util.Comparator;

public class SortingByBirthDate implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
       return o1.getAdmissionDate().compareTo(o2.getAdmissionDate());
    }
}
