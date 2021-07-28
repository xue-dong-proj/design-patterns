package nuc.edu.decorator;

/**
 * @author 薛东
 * @date 2021/7/23 16:20
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("巧克力");
        setPrice(3.0f);
    }
}
