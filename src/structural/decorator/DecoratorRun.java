package structural.decorator;

/**
 * Utilizar quando precisar estender o comportamento padrão de uma classe em tempo de execução.
 * Utilizar quando é impossível estender o comportamento de um objeto usando herança.
 */
public class DecoratorRun {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorator1 decorator = new ConcreteDecorator1(component);
        ConcreteDecorator2 decorator2 = new ConcreteDecorator2(decorator);
        decorator2.execute();
    }

}
