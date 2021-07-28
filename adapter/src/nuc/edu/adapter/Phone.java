package nuc.edu.adapter;

/**
 * @author 薛东
 * @date 2021/7/22 19:04
 */
public class Phone {
    public void change(AdapterVoltage voltage){
        if (voltage.output5V() == 5){
            System.out.println("开始充电");
        } else {
            System.out.println("不能充电");
        }
    }
}
