package behavioral.command.ex1;

import java.util.Stack;

/**
 * Classe responsável por iniciar os pedidos.
 * Possui um atributo para armazenar a referência ao objeto comando.
 * Normalmente o comando é recebido pelo cliente.
 */
public class Invoker {

    private Command command;

    private Stack<Command> commandStack;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void addCommand(Command command) {
        if (commandStack == null) {
            commandStack = new Stack<>();
        }
        commandStack.push(command);
    }

    public void executeCommand() {
        command.execute();
    }

    public void executeCommandsFromStack() {
        if (commandStack == null) {
           return;
        }
        while (!commandStack.empty()) {
            Command command = commandStack.pop();
            command.execute();
        }
    }
}
