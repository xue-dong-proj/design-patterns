package nuc.edu.facade;

/**
 * @author 薛东
 * @date 2021/7/24 17:08
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
