public class Student<T ,V extends Comparable<V>> extends Person<T,V> implements Comparable<Student<T,V>> {
    private T id;
//private static int generalId;
    public Student(V name, T age) {
        super(name, age);
//        this.id = generalId;
//        generalId++;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student<T,V> o) {
        return super.getName().compareTo(o.getName());
//        System.out.println(super.getName() + "<>" +o.getName());
//        if (o.getAge() > super.getAge()){
//            return -1;
//        }
//        if (o.getAge() < super.getAge()){
//            return 1;
//        }
//        if (o.getId() > this.id){
//            return -1;
//        }
//        if (o.getId() < this.id){
//            return 1;
//        }
//
//        return 0;

    }
}
