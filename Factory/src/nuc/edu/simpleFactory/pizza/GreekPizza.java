package nuc.edu.simpleFactory.pizza;

/**
 * @author 薛东
 * @date 2021/7/21 11:57
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
