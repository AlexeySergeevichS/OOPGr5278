package Interfaces;

import Classes.Actor;

public interface IActorBehaviour {
    public boolean isTakeOrder();

    public boolean isMakeOrder();

    public void setTakeOrder(boolean val);

    public void setMakeOrder(boolean val);

    /**
     * @return Является ли участником акции
     */
    public boolean isPromo();
    public Actor getActor();

}