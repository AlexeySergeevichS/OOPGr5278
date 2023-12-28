package Domain;

public class Bottle extends Product {
    private float bottleVolume;

    public Bottle(int price, int place, String name, long id, float bottleVolume) {
        super(price, place, name, id);
        this.bottleVolume = bottleVolume;
    }

    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return super.toString() + "Volume = " + bottleVolume + "\n" ;
    }
    
    
    
}
