package behavioral.observer.ex2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    public String state = "";

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    /**
     * Executa alguma regra de negócio e notifica os observers.
     */
    public void businessLogic() {
        state = "new state";
        notifyObservers();
    }
}
