import domain.Student;
import domain.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student3 = new Student("Лена",19);
        Student student2 = new Student("Ира",21);
        Student student1 = new Student("Федя",19);
        Student student4 = new Student("Саша",22);
        Student student5 = new Student("Егор",19);
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        StudentGroup group = new StudentGroup(list,1);
        for (Student student: group){
            System.out.println(student);
        }
        Collections.sort(group.getList());
        System.out.println("============");
        for (Student student: group){
            System.out.println(student);
        }


    }
}