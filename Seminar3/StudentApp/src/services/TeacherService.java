package services;

import domain.PersonComparator;

import domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();

    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age,"Преподаватель");
        count++;
        teachers.add(teach);
        sortByFIO();
    }
    public void sortByFIO(){
        PersonComparator<Teacher> tComp = new PersonComparator<>();
        teachers.sort(tComp);
    }
}
