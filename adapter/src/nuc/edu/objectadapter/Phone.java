package nuc.edu.objectadapter;

/**
 * @author 薛东
 * @date 2021/7/22 19:24
 */
public class Phone {
    public void change(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5){
            System.out.println("适配成功");
        } else {
            System.out.println("适配失败");
        }
    }
}
