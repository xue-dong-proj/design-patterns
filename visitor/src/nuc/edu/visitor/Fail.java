package nuc.edu.visitor;

/**
 * @author 薛东
 * @date 2021/7/27 12:35
 */
public class Fail extends Action{
    @Override
    void manCommand(Man man) {
        System.out.println("男人的表演很失败");
    }

    @Override
    void womenCommand(Women women) {
        System.out.println("女人的表演很失败");
    }
}
