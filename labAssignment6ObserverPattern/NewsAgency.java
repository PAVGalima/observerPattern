package labAssignment6ObserverPattern;

public interface NewsAgency {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers();

}