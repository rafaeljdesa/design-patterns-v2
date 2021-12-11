package creational.abstractfactory;

/**
 * Abstract Factory é utilizado quando temos que trabalhar com famílias de produtos.
 * Importante lembrar que a classe cliente não deve saber exatamente qual família é utilizada pela aplicação naquele momento.
 */
public class AbstractFactoryRun {

    public static void main(String[] args) {
        Application application = getApplicationWindows();
        application.createUI();

        Application application2 = getApplicationMac();
        application2.createUI();
    }

    /**
     * Normalmente são os métodos/classes de configuração que devem fornecer a Factory a ser utilizada pela classe cliente.
     */
    public static Application getApplicationWindows() {
        // ex: Whether SO is Windows
        return new Application(new WinFactory());
    }

    public static Application getApplicationMac() {
        // ex: Whether SO is Mac
        return new Application(new MacFactory());
    }

}
