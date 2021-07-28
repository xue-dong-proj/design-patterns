package nuc.edu.decorator;

/**
 * @author 薛东
 * @date 2021/7/23 16:13
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
