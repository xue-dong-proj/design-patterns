package nuc.edu.objectadapter;

/**
 * @author 薛东
 * @date 2021/7/22 19:21
 */
public class VoltageAdapter implements IVoltage5V{
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dist  = 0;
        if (null != voltage220V){
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器");
            dist = src / 44;
            System.out.println("适配完成");
        }

        return dist;
    }
}
