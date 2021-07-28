package nuc.edu.test8.improve;

/**
 * @author 薛东
 * @date 2021/7/20 19:14
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

enum Singleton{
    INSTANCE;
}
