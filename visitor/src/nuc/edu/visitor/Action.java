package nuc.edu.visitor;

/**
 * @author 薛东
 * @date 2021/7/27 12:33
 */
public abstract class Action {
    abstract void manCommand(Man man);

    abstract void womenCommand(Women women);
}
