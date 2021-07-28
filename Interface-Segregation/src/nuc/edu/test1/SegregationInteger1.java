package nuc.edu.test1;

/**
 * @author 薛东
 * @date 2021/7/19 13:04
 */
public class SegregationInteger1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend01(new B());
        a.depend02(new B());
        a.depend03(new B());

        C c = new C();
        c.depend01(new D());
        c.depend04(new D());
        c.depend05(new D());
    }
}

interface Interface1{
    void inter01();
    void inter02();
    void inter03();
    void inter04();
    void inter05();
}

class B implements Interface1{

    @Override
    public void inter01() {
        System.out.println("B实现了Interface1的inter01");
    }

    @Override
    public void inter02() {
        System.out.println("B实现了Interface1的inter02");
    }

    @Override
    public void inter03() {
        System.out.println("B实现了Interface1的inter03");
    }

    @Override
    public void inter04() {
        System.out.println("B实现了Interface1的inter04");
    }

    @Override
    public void inter05() {
        System.out.println("B实现了Interface1的inter05");
    }
}

class D implements Interface1{

    @Override
    public void inter01() {
        System.out.println("D实现了Interface1的inter01");
    }

    @Override
    public void inter02() {
        System.out.println("D实现了Interface1的inter02");
    }

    @Override
    public void inter03() {
        System.out.println("D实现了Interface1的inter03");
    }

    @Override
    public void inter04() {
        System.out.println("D实现了Interface1的inter04");
    }

    @Override
    public void inter05() {
        System.out.println("D实现了Interface1的inter05");
    }
}

class A{
    public void depend01(Interface1 i){
        i.inter01();
    }

    public void depend02(Interface1 i){
        i.inter02();
    }

    public void depend03(Interface1 i){
        i.inter03();
    }
}

class C{
    public void depend01(Interface1 i){
        i.inter01();
    }

    public void depend04(Interface1 i){
        i.inter04();
    }

    public void depend05(Interface1 i){
        i.inter05();
    }
}