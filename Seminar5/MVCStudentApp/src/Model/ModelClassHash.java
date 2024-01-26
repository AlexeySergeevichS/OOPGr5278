package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Model.Domain.Student;
import Controller.Interfaces.iGetModel;

public class ModelClassHash implements iGetModel {
    private HashMap<Integer, Student> students;

    // конструктор, на вход принимает List студентов
    public ModelClassHash(List<Student> students) {
        this.students = new HashMap<>();
        // заполняем hashMap значениями List
        for (Student s : students) {
            this.students.put(s.getId(), s);
        }

    }

    // определяем метод getStudents интерфейса iGetModel
    public List<Student> getStudents() {
        // конвертируем hashMap в ArrayList и возвращаем
        return new ArrayList<Student>(this.students.values());
    }
    // определяем метод delStudent интерфейса iGetModel
    public boolean delStudent(Integer id) {
        return !(this.students.remove(id) == null);
    }

   

}
