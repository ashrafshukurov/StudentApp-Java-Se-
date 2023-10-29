package sortings;

import main.Student;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class SortingBySurname implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        return o1.getSurName().compareTo(o2.getSurName());
    }

}
