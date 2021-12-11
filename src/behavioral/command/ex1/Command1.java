package behavioral.command.ex1;

/**
 * Classe command não deve executar o trabalho, e sim receber a classe de domínio e parâmetros de preferência via construtor.
 * Contudo, para simplificar o código, essas classes (command e domínio) podem ser fundidas.
 * Converte a execução de um método em objeto command.
 */
public class Command1 implements Command {

    /**
     * Classe de domínio
     */
    private final Receiver receiver;

    /**
     * Parâmetros da função
     */
    private final String param1;
    private final String param2;

    public Command1(Receiver receiver, String param1, String param2) {
        this.receiver = receiver;
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public void execute() {
        receiver.operation1(param1, param2);
    }
}
