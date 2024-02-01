import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator g1 = new GoldGenerator();
        g1.openReward();

        List<ItemGenerator> genList = new ArrayList<>();
        genList.add(g1);
        genList.add(new GemGenerator());

        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int index = rnd.nextInt(2);
            genList.get(index).openReward();
        }
    }
}
