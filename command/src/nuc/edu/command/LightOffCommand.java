package nuc.edu.command;

/**
 * @author 薛东
 * @date 2021/7/27 10:47
 */
public class LightOffCommand implements Command{
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.off();
    }

    @Override
    public void updo() {
        lightReceiver.on();
    }
}
