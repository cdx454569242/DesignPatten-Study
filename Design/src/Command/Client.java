package Command;

/**
 * @author
 * @create 2020-09-23 9:42
 */
public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        remoteController.onButtonWasPushed(0);

        remoteController.offButtonWasPushed(0);

        remoteController.undoButtonWasPushed();
    }
}
