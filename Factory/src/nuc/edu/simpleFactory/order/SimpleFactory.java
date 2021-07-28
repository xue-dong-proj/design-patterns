package nuc.edu.simpleFactory.order;

import nuc.edu.simpleFactory.pizza.ChessPizza;
import nuc.edu.simpleFactory.pizza.GreekPizza;
import nuc.edu.simpleFactory.pizza.PepperPizza;
import nuc.edu.simpleFactory.pizza.Pizza;

/**
 * @author 薛东
 * @date 2021/7/21 13:50
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")){
            pizza = new ChessPizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }

        return pizza;
    }

    public static Pizza createPizza02(String orderType){
        Pizza pizza = null;

        System.out.println("使用静态简单工厂模式");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")){
            pizza = new ChessPizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }

        return pizza;
    }
}
