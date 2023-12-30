package Classes;


import Interfaces.IReturnOrder;

public class SpecialClient extends Actor implements IReturnOrder {
    private int vipId;

    public SpecialClient(String name, int number) {
        super(name);
        this.vipId = number;
    }

    public int getVipId() {
        return vipId;
    }

    public void setVipId(int number) {
        this.vipId = number;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    /**
     * @return является ли клиент участником акции
     */
    @Override
    public boolean isPromo() {
        return false;
    }

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

}
