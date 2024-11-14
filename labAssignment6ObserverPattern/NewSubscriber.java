package labAssignment6ObserverPattern;

public class NewSubscriber implements Subscriber{
    private String name;


    public String getName(){
        return name;
    }

    public void getName(String name){
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
