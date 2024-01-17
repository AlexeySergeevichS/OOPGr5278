package domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> list;
    private int id;
    private static int generalId;


    public StudentSteam(List<StudentGroup> list) {
        this.list = list;
        this.id = ++generalId;
    }

    public List<StudentGroup> getList() {
        return list;
    }

    public void setList(List<StudentGroup> list) {
        this.list = list;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(this.list);
    }
    /**
     * Возвращает список студентов потока и их номер группы
     *
     */
    private String studentsList(){
        String retS = "";
        for (StudentGroup sg:this.list){
           for (Student s:sg){
                retS += s.getName() + " (Гр.N " + sg.getId() + "), ";
            }
        }
        return retS.substring(0, retS.length() - 2);
    }
    @Override
    public String toString() {
        return "Поток N " + this.id +
                ", количество групп: " + this.list.size() +
                ", список студентов потока: " + studentsList() ;
    }
}
