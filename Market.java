import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehavior, QueueBehavior {

    private List<Actor> queue;
    private List<Actor> queueRelease;
    Queue<Actor> actorsQueue = new ArrayDeque<>();

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder) {
                actor.setMakeOrder(true);
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder) {
                actor.setMakeOrder(true);
            }
        };
    }

    @Override
    public void releaseFromQueue() {
        for (Actor actor : queue) {
            if (actor.isTakeOrder) {
                queueRelease.add(actor);
            }
        };

        releaseFromMarket(queueRelease);
    }

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
        System.out.println(actor.getName() + " enter the market");
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList) {
            queue.remove(actor);
        };
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
    
}
