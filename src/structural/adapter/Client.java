package structural.adapter;

/**
 * Classe cliente que utiliza o objeto resultante para execução da RN.
 */
public class Client {

    public void doSomething() {
        ClientInterface clientInterface = new ServiceAdapter();
        Integer result = clientInterface.method('T');
    }

}
