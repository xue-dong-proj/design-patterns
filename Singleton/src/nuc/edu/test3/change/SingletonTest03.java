package nuc.edu.test3.change;

/**
 * @author 薛东
 * @date 2021/7/21 9:51
 */
public class SingletonTest03 {
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

    public static Singleton getInstance (){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
