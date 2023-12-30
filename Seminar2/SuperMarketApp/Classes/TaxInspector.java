package Classes;

import Interfaces.IActorBehaviour;


public class TaxInspector implements IActorBehaviour  {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(this.name, 0);
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    /**
     * @return является ли клиент участником акции
     */
    @Override
    public boolean isPromo() {
        return false;
    }

    @Override
    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    public String getName() {
        return name;
    }

 
    
}
