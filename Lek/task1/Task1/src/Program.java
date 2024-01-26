public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new View(), new SumModel());
        p.buttonClick();
    }
}
