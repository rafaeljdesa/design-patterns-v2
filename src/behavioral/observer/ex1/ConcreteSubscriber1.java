package behavioral.observer.ex1;

/**
 * Responsável por implementar a RN executada após a geração do evento.
 * Deve implementar a interface comum para que a classe concreta não fique acoplada a classe publisher.
 */
public class ConcreteSubscriber1 implements Subscriber {

    @Override
    public void update(String newState) {
        System.out.println("ConcreteSubscriber1 updated! " + newState);
    }

}
