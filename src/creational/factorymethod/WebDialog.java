package creational.factorymethod;

public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
