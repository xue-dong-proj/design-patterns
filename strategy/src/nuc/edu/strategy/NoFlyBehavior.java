package nuc.edu.strategy;

/**
 * @author 薛东
 * @date 2021/7/28 21:21
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println(" 不会飞行 ");
    }
}
