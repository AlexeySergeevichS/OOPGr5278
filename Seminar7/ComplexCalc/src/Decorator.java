public class Decorator implements iCalculable {
    private Calculator oldCalc;
    private Logger logger;

    public Decorator(Calculator c, Logger l) {
        this.oldCalc = c;
        this.logger = l;
    }

    @Override
    public String getResult() {
        String result = oldCalc.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }

    @Override
    public iCalculable sum(float argA, float argB) {
        String firstArg = oldCalc.getResult();

        String plusOrNot = "+";
        if (argB < 0) {
            plusOrNot = "";
        }

        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum с параметром %.2f%s%.2fi",
                firstArg, argA, plusOrNot, argB));
        iCalculable result = oldCalc.sum(argA, argB);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    @Override
    public iCalculable div(float argA, float argB) {
        String firstArg = oldCalc.getResult();

        String plusOrNot = "+";
        if (argB < 0) {
            plusOrNot = "";
        }
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода div с параметром %.2f%s%.2fi",
                firstArg, argA, plusOrNot, argB));
        iCalculable result = oldCalc.div(argA, argB);
        logger.log(String.format("Вызов метода div произошел"));
        return result;
    }

    @Override
    public iCalculable multi(float argA, float argB) {
        String firstArg = oldCalc.getResult();

        String plusOrNot = "+";
        if (argB < 0) {
            plusOrNot = "";
        }

        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода multi с параметром %.2f%s%.2fi",
                firstArg, argA, plusOrNot, argB));
        iCalculable result = oldCalc.multi(argA, argB);
        logger.log(String.format("Вызов метода multi произошел"));
        return result;
    }

    @Override
    public void resetCalc() {
        logger.log("Сброс калькулятора на 0");
        oldCalc.resetCalc();
    }
}
