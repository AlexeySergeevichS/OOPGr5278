import java.util.Iterator;
import java.util.List;

public class StudentIteratorG<T ,V extends Comparable<V>> implements Iterator<StudentG<T,V>> {
private int count;
private List<StudentG<T,V>> list;

    public StudentIteratorG(List<StudentG<T,V>> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {

        return count< list.size();

    }

    @Override
    public StudentG<T,V> next() {
        return list.get(count++);
    }
}
