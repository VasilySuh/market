public interface QueueBehaviour{
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders(Actor orders);
    void releaseFromQueue();
    boolean isEmpty();
}
