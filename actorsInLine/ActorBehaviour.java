public interface ActorBehaviour {

    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean takeOrder);

    public boolean isMakeOrder();
    public boolean isTakeOrder();
}
