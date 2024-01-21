package domain;

public class Teacher extends Worker {
    private String academicDegree;

    public Teacher(String name, int age, String academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "academicDegree='" + academicDegree + '\'' +
                '}';
    }
}
