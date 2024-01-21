import controllers.AccountController;
import domain.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student3 = new Student("Лена", 19);
        Student student2 = new Student("Ира", 21);
        Student student1 = new Student("Федя", 19);
        Student student4 = new Student("Саша", 22);
        Student student5 = new Student("Егор", 19);
        List<Student> list1 = new ArrayList<>();
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.add(student4);
        list1.add(student5);
        StudentGroup group1 = new StudentGroup(list1);
//        for (Student student: group1){
//            System.out.println(student);
//        }
        Student student6 = new Student("Катя", 25);
        Student student7 = new Student("Света", 22);
        Student student8 = new Student("Марат", 18);
        Student student9 = new Student("Гриша", 21);
        Student student10 = new Student("Женя", 18);
        Student student18 = new Student("Коля", 25);
        Student student19 = new Student("Оля", 23);
        Student student20 = new Student("Майкл", 21);
        Student student21 = new Student("Игорь", 22);
        List<Student> list2 = new ArrayList<>();
        list2.add(student6);
        list2.add(student7);
        list2.add(student8);
        list2.add(student9);
        list2.add(student10);
        list2.add(student18);
        list2.add(student19);
        list2.add(student20);
        list2.add(student21);
        StudentGroup group2 = new StudentGroup(list2);
        Student student22 = new Student("Света", 25);
        Student student23 = new Student("Вова", 22);
        Student student24 = new Student("Дима", 18);
        Student student25 = new Student("Андрей", 21);
        Student student26 = new Student("Юля", 18);
        Student student27 = new Student("Полина", 25);
        Student student28 = new Student("Оля", 23);
        Student student29 = new Student("Леха", 21);
        Student student30 = new Student("Вадик", 22);
        List<Student> list4 = new ArrayList<>();
        list4.add(student22);
        list4.add(student23);
        list4.add(student24);
        list4.add(student25);
        list4.add(student26);
        list4.add(student27);
        list4.add(student28);
        list4.add(student29);
        list4.add(student30);
        StudentGroup group4 = new StudentGroup(list4);
//        for (Student student: group2){
//            System.out.println(student);
//        }
        Student student11 = new Student("Вика", 17);
        Student student12 = new Student("Люся", 22);
        Student student13 = new Student("Ваня", 20);
        Student student14 = new Student("Егор", 21);
        Student student15 = new Student("Вася", 18);
        Student student16 = new Student("Леня", 22);
        Student student17 = new Student("Витя", 21);
        List<Student> list3 = new ArrayList<>();
        list3.add(student11);
        list3.add(student12);
        list3.add(student13);
        list3.add(student14);
        list3.add(student15);
        list3.add(student16);
        list3.add(student17);
        StudentGroup group3 = new StudentGroup(list3);
//        for (Student student: group3){
//            System.out.println(student);
//        }
        List<StudentGroup> list = new ArrayList<>();
        list.add(group4);
        list.add(group3);
        list.add(group2);
        list.add(group1);
        StudentSteam steam1 = new StudentSteam(list);
        System.out.println("+++++++++++++");
        System.out.println("Вывод групп из потока");
        System.out.println("+++++++++++++");
        for (StudentGroup gr : steam1) {
            System.out.println(gr);
        }
        Collections.sort(steam1.getList());
        System.out.println("+++++++++++++");
        System.out.println("Вывод групп из потока после сортировки");
        System.out.println("+++++++++++++");
        for (StudentGroup gr : steam1) {
            System.out.println(gr);
        }

        System.out.println("+++++++++++++");
        System.out.println("Вывод потока через toString");
        System.out.println("+++++++++++++");
        System.out.println(steam1);

//        Collections.sort(group.getList());
//        System.out.println("============");
//        for (Student student: group){
//            System.out.println(student);
//        }
        Teacher t1 = new Teacher("Эдуард", 50, "Доцент");
        Teacher t2 = new Teacher("Владимир", 51, "Доцент");
        Teacher t3 = new Teacher("Оксана", 56, "Доцент");
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);
        Employee e1 = new Employee("Федор", 37, "Дворник");
        Employee e2 = new Employee("Иван", 40, "Грузчик");
        Employee e3 = new Employee("Зоя", 41, "Повар");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
//        AccountController controller = new AccountController();
        //controller.paySalary(t1,50000);
        AccountController.paySalary(t1, 50000);
        AccountController.paySalary(e1, 25000);
//        controller.paySalary(e1,25000);
        for (StudentGroup gr : steam1) {
            System.out.println("++++++++++++");
            System.out.println("Средний возраст студентов группы " + gr.getId() + " равен " + String.format("%1.2f", AccountController.averageAge(gr.getList())));
        }
        System.out.println("++++++++++++");
        System.out.println("Средний возраст преподавателей " + String.format("%1.2f", AccountController.averageAge(teacherList)));
        System.out.println("++++++++++++");
        System.out.println("Средний возраст работников " + String.format("%1.2f", AccountController.averageAge(employeeList)));

        List<Person> allPersonList = new ArrayList<>();
        allPersonList.addAll(teacherList);
        allPersonList.addAll(employeeList);
        for (StudentGroup gr : steam1) {
            allPersonList.addAll(gr.getList());
        }
        System.out.println("++++++++++++");
        System.out.println("Средний возраст всех " + String.format("%1.2f", AccountController.averageAge(allPersonList)));




    }
}