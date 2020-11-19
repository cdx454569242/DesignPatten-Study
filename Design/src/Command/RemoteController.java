package Command;

/**
 * @author
 * @create 2020-09-23 9:35
 */
public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int on,Command onCommand,Command offCommand){
        onCommands[on] = onCommand;
        offCommands[on] = offCommand;
    }

    public void onButtonWasPushed(int on){
        onCommands[on].execute();
        undoCommand = onCommands[on];
    }

    public void offButtonWasPushed(int off){
        offCommands[off].execute();
        undoCommand = onCommands[off];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
