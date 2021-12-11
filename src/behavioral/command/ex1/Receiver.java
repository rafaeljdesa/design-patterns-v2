package behavioral.command.ex1;

/**
 * Classe de domínio. Possui a regra de negócio a ser executada.
 */
public class Receiver {

    public void operation1(String param1, String param2) {
        System.out.println("Executed operation 1 " + param1 + " " + param2);
    }

    public void operation2(String param1) {
        System.out.println("Executed operation 2 " + param1);
    }

}
