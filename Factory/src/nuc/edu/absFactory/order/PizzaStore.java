package nuc.edu.absFactory.order;

/**
 * @author 薛东
 * @date 2021/7/21 16:50
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDOrderPizza());
    }
}
