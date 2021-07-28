package nuc.edu.absFactory.order;

import nuc.edu.absFactory.pizza.BJCheessPizza;
import nuc.edu.absFactory.pizza.BJPepperPizza;
import nuc.edu.absFactory.pizza.Pizza;

/**
 * @author 薛东
 * @date 2021/7/21 16:37
 */
public class BJOrderPizza implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;

        if(orderType.equals("cheese")) {
            pizza = new BJCheessPizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
