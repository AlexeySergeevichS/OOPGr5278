package task2;

public class Car extends Vehicle implements iSpeedAllow {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
        
    }
    public double calculateAllowedSpeed(){
        return super.maxSpeed * 0.8;
    }
    
}
