
public class Sum<T extends Number> {
    private T a;
    private T b;
    public Sum(T a, T b) {
        this.a = a;
        this.b = b;
    }
     public T getA() {
        return a;
    }
    public void setA(T a) {
        this.a = a;
    }
    public T getB() {
        return b;
    }
    public void setB(T b) {
        this.b = b;
    }
 
}
