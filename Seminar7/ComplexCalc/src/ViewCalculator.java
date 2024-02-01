import java.util.Scanner;

public class ViewCalculator {
    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            float primaryArgA = promptFloat("Введите вещественную часть числа: ");
            float primaryArgB = promptFloat("Введите мнимую часть числа: ");
            calculator.sum(primaryArgA, primaryArgB);
            while (true) {
                String cmd = prompt("Введи команду (*,+,/,=): ");
                if (cmd.equals("*")) {
                    float argA = promptFloat("Введите вещественную часть второго аргумента: ");
                    float argB = promptFloat("Введите мнимую часть второго аргумента: ");
                    calculator.multi(argA, argB);
                    continue;
                }
                if (cmd.equals("/")) {
                    float argA = promptFloat("Введите вещественную часть второго аргумента: ");
                    float argB = promptFloat("Введите мнимую часть второго аргумента: ");
                    calculator.div(argA, argB);
                    continue;
                }

                if (cmd.equals("+")) {
                    float argA = promptFloat("Введите вещественную часть второго аргумента: ");
                    float argB = promptFloat("Введите мнимую часть второго аргумента: ");
                    calculator.sum(argA, argB);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.println(result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?").toUpperCase();
            if (cmd.equals("Y")) {
                calculator.resetCalc();
                continue;

            }
            break;
        }

    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private float promptFloat(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String str = in.nextLine();
        float retFloat;
        while (true) {
            try {
                retFloat = Float.parseFloat(str);
                break;
            } catch (Exception e) {
                System.out.print(message);
                str = in.nextLine();
            }
        }
        return retFloat;
    }
}
