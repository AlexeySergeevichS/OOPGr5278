package Classes;

import Interfaces.IReturnOrder;

/**
 * Акционный клиент
 */
public class PromoClient extends Actor implements IReturnOrder {
    /**
     * Название акции
     */
    private String promo;
    private int idClient;
    /**
     * Количество участников акции
     */
    public static int countClientPromo;

    /**
     * @param name тмя клиента
     * @param promoName название акции
     * @param number идентификационны номер номер
     */
    public PromoClient(String name, String promoName, int number) {
        super(name);
        this.idClient = number;
        this.promo = promoName;
        countClientPromo++;

    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;

    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;

    }

    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;

    }

    /**
     * @return Является ли клиент участником акции
     */
    @Override
    public boolean isPromo() {
        return true;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public void returnOrder() {
        setMakeOrder(false);
        setTakeOrder(false);
    }

    @Override
    public boolean isReturnOrder() {
        return this.isReturnOrder;
    }

    @Override
    public void setReturnOrder() {
        this.isReturnOrder = true;

    }

    public String getPromo() {
        return promo;
    }
}
