package operation;

import com.google.gson.*;
import main.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToJson {
    public static void writingJson(List<Student> list)throws IOException {
        try(FileWriter fileWriter=new FileWriter("student.json")){
                Gson gson=new Gson();
                String json=gson.toJson(list);
                fileWriter.write(json);


        }

    }
}
