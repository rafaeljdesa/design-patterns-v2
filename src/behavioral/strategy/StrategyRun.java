package behavioral.strategy;

/**
 * Utilizar strategy quando temos implementações diferentes em um mesmo contexto.
 * Utilizar quando a classe tiver muitas condicionais variando a implementação do mesmo algoritmo.
 * Possibilidade de alterar a implementação em tempo de execução.
 * Funções lambda podem substituir o uso de strategy, quando bem utilizadas.
 * Associado com o padrão Template Method (herança). Strategy (composição).
 */
public class StrategyRun {

    public static void main(String[] args) {
        Data data = new Data() {};

        Context context = new Context();

        Strategy strategy1 = new ConcreteStrategy1();
        context.setStrategy(strategy1);
        context.executeStrategy(data);

        Strategy strategy2 = new ConcreteStrategy2();
        context.setStrategy(strategy2);
        context.executeStrategy(data);
    }

}
