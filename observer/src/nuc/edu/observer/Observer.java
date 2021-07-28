package nuc.edu.observer;

/**
 * @author 薛东
 * @date 2021/7/27 22:03
 */
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
