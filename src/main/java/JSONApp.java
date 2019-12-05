import domain.BasicStudent;
import domain.Student;
import json.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JSONApp {
    public static void main(String[] args) {
        Json jYear = new JsonNumber(2);
        print(jYear); // 2

        Json jMarks = new JsonArray(new JsonNumber(3), new JsonNumber(4));
        print(jMarks); // [3, 4]

        JsonPair name = new JsonPair("name", new JsonString("Andrii"));
        JsonPair surname = new JsonPair("surname", new JsonString("Rodionov"));
        JsonPair marks = new JsonPair("marks", jMarks);
        JsonPair year = new JsonPair("year", jYear);
        JsonObject jsonObj = new JsonObject(name, surname, year, marks);
        print(jsonObj); // {'name': 'Andrii', 'surname': 'Rodionov', 'year': 2, 'marks': [3, 4]}
        System.out.println("Imhere1");

//        print(jsonObj.projection("surname", "age", "year", "marks")); // {'surname': 'Rodionov', 'year': 2, 'marks': [3, 4]}
        System.out.println("Imhere2");

        BasicStudent basicStudent = new BasicStudent("Andrii", "Rodionov", 2);
        print(basicStudent.toJsonObject()); // {'name': 'Andrii', 'surname': 'Rodionov', 'year': 2}

    }

    private static void print(Json json) {
        System.out.println(json.toJson());
    }


    public static JsonObject sessionResult() {
        JsonObject jsonObject = null;

        // ToDo
        JsonPair name = new JsonPair("name", new JsonString("Andrii"));
        JsonPair surname = new JsonPair("surname", new JsonString("Rodionov"));
        JsonPair year = new JsonPair("year", new JsonNumber(2));
        JsonPair OOP_course =  new JsonPair("course", new JsonString("OOP"));
        JsonPair OOP_mark =  new JsonPair("mark", new JsonNumber(3));
        JsonPair OOP_passed = new JsonPair("passed", new JsonBoolean(true));

        JsonPair Eng_course =  new JsonPair("course", new JsonString("English"));
        JsonPair Eng_mark =  new JsonPair("mark", new JsonNumber(5));
        JsonPair Eng_passed = new JsonPair("passed", new JsonBoolean(true));

        JsonPair Math_course =  new JsonPair("course", new JsonString("Math"));
        JsonPair Math_mark =  new JsonPair("mark", new JsonNumber(2));
        JsonPair Math_passed = new JsonPair("passed", new JsonBoolean(false));


        JsonPair exams = new JsonPair("exams", new JsonArray(new JsonObject(OOP_course, OOP_mark, OOP_passed), new
                JsonObject(Eng_course, Eng_mark, Eng_passed), new JsonObject(Math_course, Math_mark, Math_passed)));
        return new JsonObject(name, surname, year, exams);
//        return jsonObject;
    }
}
