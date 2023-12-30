package Interfaces;



public interface IQueueBehaviour {
    public void takeInQueue(IActorBehaviour actor);
    public void releaseFromQueue();
    public void takeOrder();
    public void giveOrder();
}
