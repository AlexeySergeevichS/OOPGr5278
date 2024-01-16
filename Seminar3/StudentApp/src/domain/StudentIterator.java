package domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
private int count;
private List<Student> list;

    public StudentIterator(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {

        return count< list.size();

    }

    @Override
    public Student next() {
        return list.get(count++);
    }
}
