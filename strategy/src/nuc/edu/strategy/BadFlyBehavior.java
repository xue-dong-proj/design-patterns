package nuc.edu.strategy;

/**
 * @author 薛东
 * @date 2021/7/28 21:20
 */
public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println(" 飞行能力很差 ");
    }
}
