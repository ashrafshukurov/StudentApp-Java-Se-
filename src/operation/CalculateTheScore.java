package operation;

import main.Person;
import main.Student;
import main.StudentApp;

import java.util.Random;

public class CalculateTheScore extends Thread{
    Random random=new Random();
    StudentApp student=new StudentApp();
    Person p=new Person();
    int count_true=0;
    int count_false=0;
    @Override
    public void run() {
        for (int i = 0; i<15; i++){
            int exam_question=random.nextInt(2);
            if(exam_question==1){
               count_true++;
               p.setScore(count_true*20);
            }
            else if(exam_question==2){
                count_false++;
                p.setScore(count_true-(count_false*5));
            }
        }
    }
}
