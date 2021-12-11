package behavioral.command.ex2;

public class CopyCommand extends ClipboardCommand {

    private final String text;

    public CopyCommand(Clipboard clipboard, String text) {
        super.clipboard = clipboard;
        this.text = text;
    }

    @Override
    public void execute() {
        clipboard.copy(this.text);
        System.out.println("Executou cópia com sucesso");
    }
}
