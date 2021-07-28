package nuc.edu.simpleFactory.pizza;

/**
 * @author 薛东
 * @date 2021/7/21 11:55
 */
public class ChessPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }
}
