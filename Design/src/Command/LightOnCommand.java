package Command;

/**
 * @author
 * @create 2020-09-23 9:29
 */
public class LightOnCommand implements Command{

    LightReceiver receiver;

    public LightOnCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
