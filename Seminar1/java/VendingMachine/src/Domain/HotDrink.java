package Domain;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString()+ "Temperature = " + temperature + "\n";
    }   
    
}
