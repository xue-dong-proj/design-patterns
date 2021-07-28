package nuc.edu.factoryMethod.order;

import nuc.edu.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 薛东
 * @date 2021/7/21 14:55
 */
public abstract class OrderPizza {
    abstract Pizza createPizza(String orderType);
    public OrderPizza(){
        String orderType;
        Pizza pizza = null;

        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类：");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
