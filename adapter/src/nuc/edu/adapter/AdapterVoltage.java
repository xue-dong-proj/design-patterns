package nuc.edu.adapter;

/**
 * @author 薛东
 * @date 2021/7/22 19:03
 */
public class AdapterVoltage extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int src = output220V();
        int dirt = src / 44;
        return dirt;
    }
}
