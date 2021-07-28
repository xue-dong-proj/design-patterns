package nuc.edu.test8;

/**
 * @author 薛东
 * @date 2021/7/20 18:07
 */
public class SingletonTest8 {
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
