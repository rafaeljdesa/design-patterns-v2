package behavioral.strategy;

public class ConcreteStrategy1 implements Strategy {

    @Override
    public void execute(Data data) {
        System.out.println("ConcreteStrategy1 executed");
    }
}
