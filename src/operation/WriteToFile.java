package operation;

import main.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class WriteToFile {
    public static void writeListToFile(List<Student> list) throws IOException {
        try (FileWriter fileWriter = new FileWriter("student.csv")) {
            fileWriter.write("Name; Surname; Age; Id; Score; BirthDate; AdmissionDate" + "\n");
            for (Student student : list) {
                fileWriter.write(student.getName() + ";");
                fileWriter.write(student.getSurName() + ";");
                fileWriter.write(student.getAge() + ";");
                fileWriter.write(student.getId() + ";");
                fileWriter.write(student.getScore() + ";");
                fileWriter.write(student.getBirthdate() + ";");
                fileWriter.write(student.getAdmissionDate() + "\n");
            }
        }
    }
}
