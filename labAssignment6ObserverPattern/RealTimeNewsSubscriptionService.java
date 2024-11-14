package labAssignment6ObserverPattern;
/*
 * Lab Assignment 6: Observer Pattern
 * 11/15/24
 */
public class RealTimeNewsSubscriptionService {
    public static void main(String[] args) {

        
        // Create News Agency
        System.out.println();
        BreakingNewsAgency agency = new BreakingNewsAgency();

        // Create Subscribers
        NewSubscriber subscriber1 = new NewSubscriber();
        NewSubscriber subscriber2 = new NewSubscriber();
        NewSubscriber subscriber3 = new NewSubscriber();

        subscriber1.getName("Patrick Ace");
        subscriber2.getName("Leslie");
        subscriber3.getName("John");

        // Subscribe to News
        agency.subscribe(subscriber1);
        agency.subscribe(subscriber2);
        agency.subscribe(subscriber3);

        // Publish Breaking News
        System.out.println("\nPublishing News: 'Breaking News: Major Event Happens!'");
        agency.publishNews("Breaking News: Major Event Happens!");

        System.out.println();
        // Unsubscribe a subscriber
        agency.unsubscribe(subscriber2);

        // Publish another Breaking News
        System.out.println("\nPublishing News: 'Breaking News: Another Major Event!'");

        agency.publishNews("Breaking News: Another Major Event!");
    }

}
