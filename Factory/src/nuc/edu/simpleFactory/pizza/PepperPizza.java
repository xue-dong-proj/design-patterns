package nuc.edu.simpleFactory.pizza;

/**
 * @author 薛东
 * @date 2021/7/21 11:59
 */
public class PepperPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(" 给辣椒披萨 准备原材料 ");
    }
}
