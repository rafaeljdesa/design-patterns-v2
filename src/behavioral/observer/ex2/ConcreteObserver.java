package behavioral.observer.ex2;

public class ConcreteObserver implements Observer {

    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            System.out.println("ConcreteSubject Updated!");
        }
    }
}
