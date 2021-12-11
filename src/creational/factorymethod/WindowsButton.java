package creational.factorymethod;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("WindowsButton rendered");
    }

    @Override
    public void onClick() {
        System.out.println("WindowsButton clicked");
    }

}
