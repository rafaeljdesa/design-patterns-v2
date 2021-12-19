package structural.facade;

public class Facade {

    private final Subsystem1 subsystem1 = new Subsystem1();
    private final Subsystem2 subsystem2 = new Subsystem2();

    public void execute() {
        subsystem1.execution1();
        subsystem2.execution2();
    }

}
