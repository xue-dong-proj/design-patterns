package nuc.edu.factoryMethod.order;

import nuc.edu.factoryMethod.pizza.LDCheessPizza;
import nuc.edu.factoryMethod.pizza.LDPepperPizza;
import nuc.edu.factoryMethod.pizza.Pizza;

/**
 * @author 薛东
 * @date 2021/7/21 14:51
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")){
            pizza = new LDCheessPizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
