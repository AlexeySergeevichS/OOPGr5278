public interface iCalculable {
    iCalculable sum(float argA, float argB);
    iCalculable div(float argA, float argB);
    iCalculable multi(float argA, float argB);
     /**
     * Сброс калькулятора на 0
     * 
     */
    void resetCalc();
    String getResult();
    
}