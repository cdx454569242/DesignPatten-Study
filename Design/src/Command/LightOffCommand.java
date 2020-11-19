package Command;

/**
 * @author
 * @create 2020-09-23 9:29
 */
public class LightOffCommand implements Command{

    LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
