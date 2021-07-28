package nuc.edu.command;

/**
 * @author 薛东
 * @date 2021/7/27 10:50
 */
public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command updoCommand;

    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int num, Command onCommand,Command offCommand){
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    public void onButtonWasPushed(int num){
        onCommands[num].excute();
        updoCommand = onCommands[num];
    }

    public void offButtonWasPushed(int num){
        offCommands[num].excute();
        updoCommand = offCommands[num];
    }

    public void updoButtonCommand(){
        updoCommand.updo();
    }
}
