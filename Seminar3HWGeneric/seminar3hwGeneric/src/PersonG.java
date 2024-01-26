public abstract class Person<T, V> {
    private T age;
    private V name;

    public Person(V name, T age) {
        this.age = age;
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public V getName() {
        return name;
    }

    public void setName(V name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
