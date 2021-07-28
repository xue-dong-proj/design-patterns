package nuc.edu.visitor;

/**
 * @author 薛东
 * @date 2021/7/27 12:34
 */
public class Women extends Person{
    @Override
    void accpet(Action action) {
        action.womenCommand(this);
    }
}
