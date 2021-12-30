package structural.decorator;

/**
 * Classe que define o comportamento básico que pode ser alterado pelos decorators.
 * Complicado ou impossível estender o comportamento via herança por ser uma classe final.
 */
public final class ConcreteComponent implements Component {

    @Override
    public void execute() {
        System.out.println("Basic behavior!");
    }
}
