package task2;

public class Bus extends Vehicle  implements iSpeedAllow{

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
        
    }
    public double calculateAllowedSpeed(){
        return super.maxSpeed * 0.6;
    }
    
}
