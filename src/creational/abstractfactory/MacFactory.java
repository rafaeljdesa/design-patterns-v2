package creational.abstractfactory;

/**
 * Fábrica para a família Mac OS.
 * Cria os objetos de interface quando a aplicação estiver rodando no Mac.
 */
public class MacFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
