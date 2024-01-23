import java.util.Iterator;
import java.util.List;

public class StudentGroup<T  extends Comparable<T>,V extends Comparable<V>> implements Iterable<Student<T,V>>, Comparable<StudentGroup <T ,V > > {
    private List<Student<T,V>> list;
    private T id;
//    private static int generalId;

    public StudentGroup(List<Student<T,V>> list,T id) {
        this.list = list;
        this.id = id;
//        this.id = ++generalId;
    }

    public List<Student<T,V>> getList() {
        return list;
    }

    public void setList(List<Student<T,V>> list) {
        this.list = list;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
    /**
     * Возвращает список студентов группы
     *
     */
    private String studentsList(){
        String retS = "";
        for (Student<T,V> s :this.list){
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
    public Iterator<Student<T,V>> iterator() {
        return new StudentIterator<T,V>(list);
    }

    @Override
    public int compareTo(StudentGroup<T,V> o) {
        if (o.getList().size() > this.list.size()  ){
            return -1;
        }
        if (o.getList().size() < this.list.size()  ){
            return 1;
        }
        return this.getId().compareTo(o.getId());
//        if (o.getId() > this.getId()  ){
//            return -1;
//        }
//        if (o.getId() < this.getId()  ){
//            return 1;
//        }

//        return 0;
    }
}
