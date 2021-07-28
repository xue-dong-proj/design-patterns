package nuc.edu.absFactory.order;

import nuc.edu.absFactory.pizza.Pizza;

/**
 * @author 薛东
 * @date 2021/7/21 16:36
 */
public interface AbsFactory {
    Pizza createPizza(String orderType);
}
