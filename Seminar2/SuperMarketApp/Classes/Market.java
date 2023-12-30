package Classes;


import java.util.ArrayList;
import java.util.List;

import Interfaces.IMarketBehaviour;
import Interfaces.IQueueBehaviour;
import Interfaces.IActorBehaviour;

/**
 * Магазин
 */
public class Market implements IMarketBehaviour, IQueueBehaviour {

    /**
     * Очередь
     */
    private List<IActorBehaviour> queue;
    private int numberPromo;

    /**
     * Конструктор
     * @param promoCount максимальное количество участников акции
     */
    public Market(int promoCount) {

        this.queue = new ArrayList<IActorBehaviour>();
        this.numberPromo = promoCount;// максимальное число участников акции
    }
    public Market() {
        this(1000);
    }
    public int getNumberPromo(){return this.numberPromo;}

    /**
     * Попадание в магазин с проверкой на количество участников акции
     *
     * @param actor Посетитель
     */
    @Override
    public void acceptToMarket(IActorBehaviour actor) {
        if (!actor.getActor().isPromo()) {
            System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
            takeInQueue(actor);
        } else {
            if (this.numberPromo >= PromoClient.countClientPromo) {
                System.out.println(actor.getActor().getName() + " клиент по акции пришел в магазин ");
                takeInQueue(actor);
            } else {
                System.out.println("Для клиента " + actor.getActor().getName() + " по акции вход запрещен!");
            }
        }

    }

    /**
     * Встал в очередь
     *
     * @param actor Посетитель
     */
    @Override
    public void takeInQueue(IActorBehaviour actor) {

        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Покинул магазин
     *
     * @param actors Посетитель
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    /**
     * Обновление состояния
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Выдача заказа
     */
    @Override
    public void giveOrder() {
        for (IActorBehaviour actor : queue) {
            if (actor.getActor().isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /**
     * Покидание очереди
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (IActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Размещение заказа
     */
    @Override
    public void takeOrder() {
        for (IActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }


}