package nuc.edu.decorator;

/**
 * @author 薛东
 * @date 2021/7/23 16:17
 */
public class Decorator extends Drink{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }


    public String getDes() {
//
// obj.getDes() 输出被装饰者的信息
        return description + " " + getPrice() + " && " + drink.getDescription();
    }
}
