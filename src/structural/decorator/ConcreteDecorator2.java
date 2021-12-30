package structural.decorator;

public class ConcreteDecorator2 extends BaseDecorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        extra2();
    }

    private void extra2() {
        System.out.println("Extra behavior 2!");
    }
}
