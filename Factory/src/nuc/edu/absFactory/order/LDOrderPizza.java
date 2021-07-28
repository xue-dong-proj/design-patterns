package nuc.edu.absFactory.order;

import nuc.edu.absFactory.pizza.LDCheessPizza;
import nuc.edu.absFactory.pizza.LDPepperPizza;
import nuc.edu.absFactory.pizza.Pizza;

/**
 * @author 薛东
 * @date 2021/7/21 16:37
 */
public class LDOrderPizza implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;

        if(orderType.equals("cheese")) {
            pizza = new LDCheessPizza();
        } else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
