package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClass implements iGetModel {
    private List<Student> students;

    public ModelClass(List<Student> students) {
        this.students = students;
    }
    // определяем метод getStudents интерфейса iGetModel
    public List<Student> getStudents(){
        return this.students;
    }
    // определяем метод delStudent интерфейса iGetModel
    public boolean delStudent(Integer id) {
        for(Student s: this.students){
            if (s.getId()== id){
                this.students.remove(s);
                return true;
            }
        }
        return false;
    }
}
