package remote;

import remote.command.Command;

/**
 * Created by marcus on 25/10/2017.
 */
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() { }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
