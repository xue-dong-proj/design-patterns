package nuc.edu.facade;

/**
 * @author 薛东
 * @date 2021/7/24 17:05
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn off ");
    }

    public void pop() {
        System.out.println(" popcorn is poping	");
    }
}
