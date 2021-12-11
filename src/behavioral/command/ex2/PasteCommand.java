package behavioral.command.ex2;

public class PasteCommand extends ClipboardCommand {

    public PasteCommand(Clipboard clipboard) {
        super.clipboard = clipboard;
    }

    @Override
    public void execute() {
        String text = clipboard.paste();
        System.out.println("Executou colagem com sucesso " + text);
    }
}
