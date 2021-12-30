package structural.decorator;

/**
 * Definem os comportamentos adicionais aos componentes dinamicamente.
 *
 * Sobrescrevem métodos do decorator base e executam comportamentos tanto antes
 * quanto depois da chamada ao método pai.
 */
public class ConcreteDecorator1 extends BaseDecorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }

    private void extra() {
        System.out.println("Extra behavior!");
    }

}
