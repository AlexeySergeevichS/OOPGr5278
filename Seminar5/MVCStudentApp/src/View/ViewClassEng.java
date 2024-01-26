package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClassEng implements iGetView {
    // определяем метод printAllStudent интерфейса iGetView
    public void printAllStudent(List<Student> students) {
        System.out.println("++++++ List of students ++++++++");
        // выводим в консоль всех студентов
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("++++++++++++++");
    }
    // определяем метод prompt интерфейса iGetView
    public String prompt(String msg){
        
        Scanner in = new Scanner(System.in);
        // выводим в консоль сообщение msg
        System.out.println(msg);
        // возвращаем введенную строку
        return in.nextLine();
    }
}