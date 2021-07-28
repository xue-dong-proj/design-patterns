package nuc.edu.template;

/**
 * @author 薛东
 * @date 2021/7/26 15:41
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-----制作花生豆浆-----");
        PennutSoyaMilk pennutSoyaMilk = new PennutSoyaMilk();
        pennutSoyaMilk.make();

        System.out.println("-----制作黑豆豆浆-----");
        BlackBeanSoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();

        System.out.println("-----制作纯豆浆-----");
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
