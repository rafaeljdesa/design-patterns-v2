package behavioral.command.ex2;

/**
 * Classe cliente.
 */
public class UIComponent {

    private final Clipboard clipboard = new Clipboard();

    public void copia(String text) {
        invokeCommand(new CopyCommand(clipboard, text));
    }

    public void cola() {
        invokeCommand(new PasteCommand(clipboard));
    }

    private void invokeCommand(ClipboardCommand command) {
        command.execute();
    }
}
