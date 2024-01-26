public class App {
    public static void main(String[] args) throws Exception {
        Sum<Double> f = new Sum(10.0,20.0);

        System.out.println(f.getA()+f.getB());
    }
}
