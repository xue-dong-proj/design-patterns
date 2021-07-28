package nuc.edu.simpleFactory.order;

import nuc.edu.simpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 薛东
 * @date 2021/7/21 13:58
 */
public class OrderPizza03 {
    Pizza pizza = null;
    String orderType = "";

    public OrderPizza03() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza02(orderType);

            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
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
