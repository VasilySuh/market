import java.util.LinkedList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queue;
    private List<Actor> orders;

    public Market() {
        this.queue = new LinkedList[];
        this.orders = new LinkedList[];
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.offer(actor);
        System.out.println(actor + " добавлен в очередь.");
    }

    @Override
    public void takeOrders(){
        if (!orders.isEmpty()) {
            return orders.poll();
        }
        return;
    }

    @Override
    public void giveOrders(Actor order) {
        orders.offer(order);
        System.out.println("Заказ " + order + " добавлен.");
    }

    @Override
    public void releaseFromQueue() {
        if (!queue.isEmpty()) {
            Actor actor = queue.poll();
            System.out.println(actor + " вышел из очереди.");
        } else {
            System.out.println("Очередь пуста.");
        }
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor + " принят в магазин.");
    }

    @Override
    public void releaseFromMarket() {
        if (!queue.isEmpty()) {
            Actor customer = queue.peek();
            System.out.println(customer + " покидает магазин.");
        } else {
            System.out.println("Никто в магазине не находится.");
        }
    }

    // Метод для обновления состояния магазина
    public void update() {
        releaseFromQueue();
        if (!queue.isEmpty()) {
            Actor actor = queue.peek();
            acceptToMarket(actor);
            releaseFromMarket();
        }
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
