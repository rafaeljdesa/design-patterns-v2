package behavioral.observer.ex1;

/**
 * Utilizar quando mudanças no estado de um objeto podem precisar mudar outros objetos.
 * Utilizar quando os objetos a serem notificados são desconhecidos ou mudam dinamicamente.
 */
public class ObserverRun {

    public static void main(String[] args) {
        ConcreteSubscriber1 concreteSubscriber1 = new ConcreteSubscriber1();
        ConcreteSubscriber2 concreteSubscriber2 = new ConcreteSubscriber2();

        Publisher publisher = new Publisher();

        publisher.subscribe(concreteSubscriber1);
        publisher.subscribe(concreteSubscriber2);

        publisher.changeState("State changed!");
    }

}
