package Lek6;

public class TestTask3 extends TestTask2 {

    public TestTask3(int p) {
        super(p);
       
    }

    @Override
    public double getP() {
        
        return super.getP()*0.5;
    }
    
}
