package nuc.edu.test4.improve;

/**
 * @author 薛东
 * @date 2021/7/20 18:59
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton{
    private Singleton(){

    }

    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
