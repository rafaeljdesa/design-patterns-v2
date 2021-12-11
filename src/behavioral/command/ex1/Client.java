package behavioral.command.ex1;

/**
 * Classe cliente, responsável por criar e configurar comandos concretos.
 * Ela deve passar todos os parâmetros do pedido, incluindo uma instância do destinatário (RN), para o construtor do comando.
 */
public class Client {

    public void init() {
        // regra de negócio
        Receiver receiver = new Receiver();

        // comando concreto passando regra de negócio e parâmetros para execução
        Command command = new Command1(receiver, "test", "test2");

        // armazena commandos a serem executados e inicia o pedido
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();

        // novo comando
        Command command2 = new Command2(receiver, "test3");
        invoker.setCommand(command2);
        invoker.executeCommand();

        // exemplo com pilha de commandos
        invoker.addCommand(command);
        invoker.addCommand(command2);
        invoker.executeCommandsFromStack();
    }

}
