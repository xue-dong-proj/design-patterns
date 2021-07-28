package nuc.edu.improve;

/**
 * @author 薛东
 * @date 2021/7/21 16:58
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"白色");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
    }
}
