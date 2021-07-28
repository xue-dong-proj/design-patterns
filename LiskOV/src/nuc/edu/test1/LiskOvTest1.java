package nuc.edu.test1;

/**
 * @author 薛东
 * @date 2021/7/19 17:13
 */
public class LiskOvTest1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("8 - 3 = " + a.fun1(8, 3));
        System.out.println("1 - 8 = " + a.fun1(1, 8));
        System.out.println("----------------------");

        B b = new B();
        System.out.println("8 - 3 = " + b.fun1(8, 3));
        System.out.println("1 - 8 = " + b.fun1(1, 8));
        System.out.println("2 + 7 = " + b.fun2(2, 7));
    }
}

class A{
    public int fun1(int num1, int num2){
        return num1 - num2;
    }
}

class B extends A{
    public int fun1(int a, int b){
        return a + b;
    }

    public int fun2(int a, int b){
        return fun1(a,b) + a;
    }
}