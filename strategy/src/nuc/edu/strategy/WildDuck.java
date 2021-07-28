package nuc.edu.strategy;

/**
 * @author 薛东
 * @date 2021/7/28 21:28
 */
public class WildDuck extends Duck {
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println(" 这是野鸭 ");
    }
}
