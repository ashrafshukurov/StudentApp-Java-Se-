package sortings;

import main.Student;
import java.util.Comparator;

public class SortingByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getName().compareTo(o2.getName())==0){
            return o1.getSurName().compareTo(o2.getSurName());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
