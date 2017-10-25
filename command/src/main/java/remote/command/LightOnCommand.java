package remote.command;

import remote.device.Light;

/**
 * Created by marcus on 25/10/2017.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
