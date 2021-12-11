package behavioral.strategy;

public class ConcreteStrategy2 implements Strategy {

    @Override
    public void execute(Data data) {
        System.out.println("ConcreteStrategy2 executed");
    }
}
