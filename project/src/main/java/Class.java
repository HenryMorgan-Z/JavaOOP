import model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class {

    public static void main(String[]args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("小明", 5, "man", "202201"));
        studentList.add(new Student("小红", 5, "woman", "202202"));
        studentList.add(new Student("小花", 5, "woman", "202203"));
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
