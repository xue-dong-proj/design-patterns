package nuc.edu.test2;

/**
 * @author 薛东
 * @date 2021/7/19 14:52
 */
public class SegregationInteger2 {
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

interface InterfaceA{
    void inter01();
}

interface InterfaceB{
    void inter02();
    void inter03();
}

interface InterfaceC{
    void inter04();
    void inter05();
}

class B implements InterfaceA,InterfaceB{
    @Override
    public void inter01() {
        System.out.println("B实现了InterfaceA的inter01");
    }

    @Override
    public void inter02() {
        System.out.println("B实现了InterfaceB的inter02");
    }

    @Override
    public void inter03() {
        System.out.println("B实现了InterfaceB的inter03");
    }
}

class D implements InterfaceA,InterfaceC{

    @Override
    public void inter01() {
        System.out.println("D实现了InterfaceA的inter01");
    }

    @Override
    public void inter04() {
        System.out.println("D实现了InterfaceC的inter04");
    }

    @Override
    public void inter05() {
        System.out.println("D实现了InterfaceC的inter05");
    }
}

class A{
    public void depend01(InterfaceA i){
        i.inter01();
    }

    public void depend02(InterfaceB i){
        i.inter02();
    }

    public void depend03(InterfaceB i){
        i.inter03();
    }
}

class C{
    public void depend01(InterfaceA i){
        i.inter01();
    }

    public void depend04(InterfaceC i){
        i.inter04();
    }

    public void depend05(InterfaceC i){
        i.inter05();
    }
}