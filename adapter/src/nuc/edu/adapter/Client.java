package nuc.edu.adapter;

/**
 * @author 薛东
 * @date 2021/7/22 19:05
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        phone.change(new AdapterVoltage());
    }
}
