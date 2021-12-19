package behavioral.observer.ex1;

public class ConcreteSubscriber2 implements Subscriber {

    @Override
    public void update(String newState) {
        System.out.println("ConcreteSubscriber2 updated! " + newState);
    }
}
