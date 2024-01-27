package Lek6;

public class TestTask {
    int p;

    public TestTask(int p) {
        this.p = p;
    }
    public double getP(){
        return (p*0.9);
    }
    @Override
    public String toString() {
        return "TestTask [p=" + p + "]";
    }

    
}
