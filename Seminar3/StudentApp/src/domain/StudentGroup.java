package domain;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> list;
    private int id;
    private static int generalId;

    public StudentGroup(List<Student> list) {
        this.list = list;
        this.id = ++generalId;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /**
     * Возвращает список студентов группы
     *
     */
    private String studentsList(){
        String retS = "";
        for (Student s :this.list){
            retS += s.getName() + ", ";
        }
        return retS.substring(0, retS.length() - 2);
    }
    @Override
    public String toString() {
        return "Группа N " + id +
                ", студентов: " + this.list.size() +
                ", список: " + studentsList();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(list);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (o.getList().size() > this.list.size()  ){
            return -1;
        }
        if (o.getList().size() < this.list.size()  ){
            return 1;
        }
        if (o.getId() > this.getId()  ){
            return -1;
        }
        if (o.getId() < this.getId()  ){
            return 1;
        }

        return 0;
    }
}
