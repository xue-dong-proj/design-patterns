package nuc.edu.test1;

/**
 * @author 薛东
 * @date 2021/7/20 17:41
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}


class Singleton{
    private Singleton() {

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}