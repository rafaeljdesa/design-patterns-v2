package structural.adapter;

/**
 * Utilizar quando tiver interfaces incompatíveis com o código cliente.
 */
public class AdapterRun {
    public static void main(String[] args) {
        Client client = new Client();
        client.doSomething();
    }
}
