package nuc.edu.decorator;

/**
 * @author 薛东
 * @date 2021/7/23 16:19
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDescription("牛奶");
        setPrice(2.0f);
    }
}
