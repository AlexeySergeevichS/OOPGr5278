package domain;

public class Employee extends Worker {
    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    private String special;

    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "special='" + special + '\'' +
                '}';
    }
}
