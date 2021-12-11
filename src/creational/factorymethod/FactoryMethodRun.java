package creational.factorymethod;

/**
 * Factory Method é utilizado quando temos um comportamento padrão mas delegamos a criação de objetos para o método fábrica
 */
public class FactoryMethodRun {

    public static void main(String[] args) {
        WebDialog webDialog = new WebDialog();
        webDialog.render();

        WindowsDialog windowsDialog = new WindowsDialog();
        windowsDialog.render();
    }
}
