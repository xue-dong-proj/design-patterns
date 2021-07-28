package nuc.edu.command;

/**
 * @author 薛东
 * @date 2021/7/27 10:45
 */
public class LightOnCommand implements Command {
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.on();
    }

    @Override
    public void updo() {
        lightReceiver.off();
    }
}
