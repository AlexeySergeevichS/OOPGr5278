package domain;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> list;
    private int id;

    public StudentGroup(List<Student> list, int id) {
        this.list = list;
        this.id = id;
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

    @Override
    public String toString() {
        return "StudentGroup{" +
                "list=" + list +
                ", id=" + id +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(list);
    }
}
