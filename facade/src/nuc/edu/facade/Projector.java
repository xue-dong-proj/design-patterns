package nuc.edu.facade;

/**
 * @author 薛东
 * @date 2021/7/24 17:06
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }


    public void on() {
        System.out.println(" Projector on ");
    }


    public void off() {
        System.out.println(" Projector off ");
    }

    public void focus() {
        System.out.println(" Projector is focusing	");
    }
}
