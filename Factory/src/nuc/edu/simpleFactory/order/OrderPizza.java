package nuc.edu.simpleFactory.order;

import nuc.edu.simpleFactory.pizza.ChessPizza;
import nuc.edu.simpleFactory.pizza.GreekPizza;
import nuc.edu.simpleFactory.pizza.PepperPizza;
import nuc.edu.simpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 薛东
 * @date 2021/7/21 12:01
 */
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;

        do {
            orderType = getType();
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
            } else if (orderType.equals("cheese")){
                pizza = new ChessPizza();
                pizza.setName(" 奶酪披萨 ");
            } else if (orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName(" 胡椒披萨 ");
            } else {
                break;
            }

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
