package nuc.edu.decorator;

/**
 * @author 薛东
 * @date 2021/7/23 16:19
 */
public class Soy extends Decorator{

    public Soy(Drink drink) {
        super(drink);
        setDescription("豆浆");
        setPrice(1.5f);
    }
}
