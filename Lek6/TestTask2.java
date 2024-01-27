package Lek6;

public class TestTask2 extends TestTask{

    
    public TestTask2(int p) {
        super(p);
        
    }

    @Override
    public double getP() {
        
        return super.getP()*0.90;
    }

    
}
