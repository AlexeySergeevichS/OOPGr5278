package Product;

import Intrface.iGameItem;

public class GemReward implements iGameItem {

    @Override
    public void open() {
       System.out.println("Gem!");
    }
    
}
