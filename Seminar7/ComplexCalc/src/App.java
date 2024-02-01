public class App {
    public static void main(String[] args) throws Exception {
        // Без логирования
        // iCalculable calc = new Calculator();
        // ViewCalculator view = new ViewCalculator(calc);
        // view.run();
        // С логгированием
        Decorator newCalc = new Decorator(new Calculator(), new Logger());
        ViewCalculator view = new ViewCalculator(newCalc);
        view.run();
    }
}
