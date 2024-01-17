package domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup> {

    private int count;
    private List<StudentGroup> list;

    public StudentGroupIterator(List<StudentGroup> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return count< list.size();
    }

    @Override
    public StudentGroup next() {
        return list.get(count++);
    }
}
