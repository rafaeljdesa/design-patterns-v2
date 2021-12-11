package behavioral.command.ex2;

/**
 * Classe command junto à classe de domínio da aplicação.
 * Poderia se chamar ClipboardService.
 */
public abstract class ClipboardCommand {
    protected Clipboard clipboard;
    public abstract void execute();
}
