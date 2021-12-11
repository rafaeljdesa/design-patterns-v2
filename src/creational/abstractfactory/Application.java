package creational.abstractfactory;

public class Application {

    private UIFactory uiFactory;
    private Button button;
    private Checkbox checkbox;

    /**
     * Cliente não sabe qual família de UI está sendo utilizada.
     * Ainda assim o comportamento de criação da UI não é afetado.
     */
    public Application(UIFactory uiFactory) {
        this.uiFactory = uiFactory;
    }

    public void createUI() {
        this.button = uiFactory.createButton();
        this.checkbox = uiFactory.createCheckbox();
        System.out.println("===== UI created =====");
        System.out.println(this.button);
        System.out.println(this.checkbox);
    }

}
