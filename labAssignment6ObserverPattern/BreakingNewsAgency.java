package labAssignment6ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class BreakingNewsAgency implements NewsAgency{
    private List<Subscriber> subscribers = new ArrayList<>();
    private String news;

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber " + ((NewSubscriber) subscriber).getName() + " subscribed.");
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber " + ((NewSubscriber) subscriber).getName() + " unsubscribed.");
    }

    public void publishNews(String news) {
        this.news = news;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

}
