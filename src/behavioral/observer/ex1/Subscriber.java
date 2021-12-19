package behavioral.observer.ex1;

/**
 * Interface que será implementada pelas classes concretas (assinantes).
 * Pode receber parâmetros com detalhes do evento gerado pelo publisher.
 */
public interface Subscriber {
    void update(String state);
}
