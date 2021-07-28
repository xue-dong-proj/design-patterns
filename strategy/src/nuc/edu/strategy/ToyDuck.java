package nuc.edu.strategy;

/**
 * @author 薛东
 * @date 2021/7/28 21:26
 */
public class ToyDuck extends Duck{
    public ToyDuck (){
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println(" 玩具鸭子 ");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }
}
