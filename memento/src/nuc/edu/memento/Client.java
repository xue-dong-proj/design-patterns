package nuc.edu.memento;

/**
 * @author 薛东
 * @date 2021/7/28 10:10
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState(" 状态#1  攻击力 100 ");

        //保存了当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 状 态 #2 攻 击 力 80 ");
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 状 态 #3 攻 击 力 50 ");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前的状态是 =" + originator.getState());
        //希望得到状态 1, 将 originator 恢复到状态 1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态 1 ,  当前的状态是");

        System.out.println("当前的状态是 =" + originator.getState());
    }
}
