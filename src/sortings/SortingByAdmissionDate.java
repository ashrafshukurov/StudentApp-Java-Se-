package sortings;

import java.util.Comparator;
import main.Student;
public class SortingByAdmissionDate implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAdmissionDate().compareTo(o2.getAdmissionDate());
    }
}
