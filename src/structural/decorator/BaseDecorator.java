package structural.decorator;

/**
 * Possui um campo para referenciar o objeto envolvido.
 * Delega todas as operações para o objeto envolvido.
 */
public abstract class BaseDecorator implements Component {

    private final Component wrappee;

    public BaseDecorator(Component component) {
        wrappee = component;
    }

    @Override
    public void execute() {
        wrappee.execute();
    }
}
