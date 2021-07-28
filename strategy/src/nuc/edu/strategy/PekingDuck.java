package nuc.edu.strategy;

/**
 * @author 薛东
 * @date 2021/7/28 21:24
 */
public class PekingDuck extends Duck{
    public PekingDuck(){
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println(" 北京鸭子 ");
    }
}
