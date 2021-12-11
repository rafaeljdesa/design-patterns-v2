package behavioral.command.ex2;

/**
 * Classe de plugin. Normalmente injetada na aplicação para lidar com nativo.
 */
public final class Clipboard {

    private String text;

    public void copy(String text) {
        this.text = text;
    }

    public String paste() {
        return this.text;
    }

}
