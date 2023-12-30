import Classes.*;
import Interfaces.IActorBehaviour;



public class main {
    public static void main(String[] args) {
        Market magnit = new Market(3);
        Actor client1 = new OrdinaryClient("Борис",1);
        magnit.acceptToMarket(client1);
        Actor client2 = new OrdinaryClient("Ольга",2);
        magnit.acceptToMarket(client2);
        Actor client3 = new SpecialClient("Киркоров",1);
        magnit.acceptToMarket(client3);
        IActorBehaviour client4 = new TaxInspector();
        magnit.acceptToMarket(client4);
        Actor client5 = new PromoClient("Ваня","Новый год",666);
        magnit.acceptToMarket(client5);
        Actor client6 = new PromoClient("Вася","Новый год",667);
        magnit.acceptToMarket(client6);
        Actor client7 = new PromoClient("Федя","Новый год",668);
        magnit.acceptToMarket(client7);
        Actor client8 = new PromoClient("Гога","Новый год",669);
        magnit.acceptToMarket(client8);

        magnit.update();

        

    }
}
