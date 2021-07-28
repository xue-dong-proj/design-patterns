package nuc.edu.interfaceadapter;

/**
 * @author 薛东
 * @date 2021/7/22 19:49
 */
public class Client {
    public static void main(String[] args) {
        AbsA a = new AbsA() {
            @Override
            public void m1() {
                System.out.println("使用了m1()方法");
            }
        };

        a.m1();
    }
}
