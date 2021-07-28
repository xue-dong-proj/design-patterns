package nuc.edu.factoryMethod.order;


import nuc.edu.factoryMethod.pizza.BJCheessPizza;
import nuc.edu.factoryMethod.pizza.BJPepperPizza;
import nuc.edu.factoryMethod.pizza.Pizza;

/**
 * @author 薛东
 * @date 2021/7/21 14:51
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")){
            pizza = new BJCheessPizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
