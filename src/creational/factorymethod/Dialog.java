package creational.factorymethod;

public abstract class Dialog {

    /**
     * Comportamento
     */
    public void render() {
        Button button = createButton();
        button.onClick();
        button.render();
    }

    /**
     * Método fábrica
     */
    public abstract Button createButton();

}
