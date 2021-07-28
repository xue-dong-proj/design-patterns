package nuc.edu.test2;

/**
 * @author 薛东
 * @date 2021/7/19 17:19
 */
public class LiskOvTest2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("3 - 8 = " + a.fun1(3, 8));
        System.out.println("1 - 8 = " + a.fun1(1, 8));

        System.out.println("---------------");

        B b = new B();
        System.out.println("3 - 8 = " + b.fun1(3, 8));
        System.out.println("1 + 8 = " + b.fun2(1, 8));
    }
}

class Base{

}

class A extends Base{
    public int fun1(int num1, int num2){
        return num1 - num2;
    }
}

class B extends Base{
    private A a = new A();

    public int fun1(int a, int b){
        return this.a.fun1(a,b);
    }
    public int fun2(int a, int b){
        return a + b;
    }
}
