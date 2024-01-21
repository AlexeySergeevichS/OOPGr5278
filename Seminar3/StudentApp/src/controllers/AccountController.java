package controllers;

import domain.Person;

import domain.Worker;

import java.util.List;

public class AccountController {
    public static <T extends Worker, V> void paySalary(T person, V salar) {
        System.out.println(person.getName() + " выплачена зарплата " + salar);
    }

    public static <T extends Person> double averageAge(List<T> person) {
        double sum = 0;
        for (T per : person) {
            sum += per.getAge();
        }
        return sum / person.size();
    }
}
