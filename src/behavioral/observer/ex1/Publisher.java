package behavioral.observer.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Controla o estado principal e envia eventos para os subscribers sempre que seu estado é alterado.
 * Também podem ocorrer eventos sempre que algum determinado comportamento é executado.
 * Padrão muito utilizado em computação assíncrona.
 */
public class Publisher {

    private final List<Subscriber> subscribers = new ArrayList<>();
    private String mainState = "";

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void changeState(String newState) {
        mainState = newState;
        notifySubscribers();
    }

    private void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.update(mainState));
    }

}
