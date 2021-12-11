package creational.abstractfactory;

/**
 * Fábrica para a família Windows.
 * Cria os objetos de interface quando a aplicação estiver rodando no Windows.
 */
public class WinFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
