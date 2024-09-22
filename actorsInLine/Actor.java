public abstract class Actor implements ActorBehaviour {
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected final String name;

    public Actor(String name){
        this.name = name;
    }

    public abstract String getName();


}
