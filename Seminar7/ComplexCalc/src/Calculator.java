public class Calculator implements iCalculable {
    private float primaryArgA;
    private float primaryArgB;

    public Calculator() {
        resetCalc();
    }

    /**
     * Сложение комплексных чисел
     * 
     * @return
     */
    @Override
    public iCalculable sum(float argA, float argB) {
        primaryArgA += argA;
        primaryArgB += argB;
        return this;
    }

    /**
     * Умножение комплексных чисел
     * 
     * @return
     */
    @Override
    public iCalculable multi(float argA, float argB) {
        float newA = primaryArgA * argA - primaryArgB * argB;
        float newB = primaryArgB * argA + primaryArgA * argB;
        primaryArgA = newA;
        primaryArgB = newB;

        return this;
    }

    /**
     * Возвращает результат в виде строки
     * 
     * @return
     */
    @Override
    public String getResult() {
        String plusOrNot = "+";
        if (primaryArgB < 0) {
            plusOrNot = "";
        }
        return String.format("%.2f%s%.2fi", primaryArgA, plusOrNot, primaryArgB);
    }

    /**
     * Деление комплексных чисел
     * 
     * @return
     */
    @Override
    public iCalculable div(float argA, float argB) {
        float newA = (primaryArgA * argA + primaryArgB * argB) / (argA * argA + argB * argB);
        float newB = (primaryArgB * argA - primaryArgA * argB) / (argA * argA + argB * argB);

        primaryArgA = newA;
        primaryArgB = newB;

        return this;
    }

    @Override
    public void resetCalc() {
        this.primaryArgA = 0;
        this.primaryArgB = 0;
    }

}
