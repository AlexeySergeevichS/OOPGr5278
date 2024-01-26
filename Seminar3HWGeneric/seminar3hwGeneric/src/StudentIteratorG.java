import java.util.Iterator;
import java.util.List;

public class StudentIterator<T ,V extends Comparable<V>> implements Iterator<Student<T,V>> {
private int count;
private List<Student<T,V>> list;

    public StudentIterator(List<Student<T,V>> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {

        return count< list.size();

    }

    @Override
    public Student<T,V> next() {
        return list.get(count++);
    }
}
