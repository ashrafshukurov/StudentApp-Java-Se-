package operation;

import com.google.gson.Gson;
import main.Student;

import java.io.*;
import java.util.List;

public class ReadingFromJson {
    public static void main(String[] args) throws IOException {
        Gson gson=new Gson();
        List<Student> list;
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("student.json"))){
             list=gson.fromJson(bufferedReader.readLine(),List.class);
        }
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("Test.json"))){
           String json=gson.toJson(list);
           bufferedWriter.write(json);
        }


    }
}
