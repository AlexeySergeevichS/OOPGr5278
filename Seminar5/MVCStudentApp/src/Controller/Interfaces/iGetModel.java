package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
    // получение списка студентов
    public List<Student> getStudents();
    // удаление студента по его id
    public boolean delStudent(Integer id);
}

