package nuc.edu.observer;

/**
 * @author 薛东
 * @date 2021/7/27 22:29
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();

        weatherData.registerObserver(currentConditions);
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);

        weatherData.removeObserver(currentConditions);
        //测试System.out.println();
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);
    }
}
