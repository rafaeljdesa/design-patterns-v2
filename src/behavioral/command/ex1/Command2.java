package behavioral.command.ex1;

public class Command2 implements Command {

    private final Receiver receiver;
    private final String param;

    public Command2(Receiver receiver, String param) {
        this.receiver = receiver;
        this.param = param;
    }

    @Override
    public void execute() {
        receiver.operation2(param);
    }
}
