package nuc.edu.objectadapter;

/**
 * @author 薛东
 * @date 2021/7/22 19:25
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.change(new VoltageAdapter(new Voltage220V()));
    }
}
