import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Student<Integer, String> s1 = new Student<>("Сергей", 26);
//        Student<Integer, String> s1 = new Student<>("Сергей", 26);
//        Student<Integer, String> s1 = new Student<>("Сергей", 26);
        List<StudentG<Integer, String>> listStud = new ArrayList<>();
        listStud.add(new StudentG<Integer, String>("Сергей", 26));
        listStud.add(new StudentG<Integer, String>("Вася", 23));
        listStud.add(new StudentG<Integer, String>("Оля", 25));
        StudentGroupG<Integer, String> group = new StudentGroupG<>(listStud,666);
        for (StudentG<Integer,String> s :group){
            System.out.println(s);
        }

    }
}