package nuc.edu.test4;

/**
 * @author 薛东
 * @date 2021/7/19 16:44
 */
public class DependecyInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

interface IReceive{
    public String getInfo();
}

class Email implements IReceive{

    @Override
    public String getInfo() {
        return "电子邮箱信息：hello world";
    }
}

class WeiXin implements IReceive{

    @Override
    public String getInfo() {
        return "微信信息：hello weixin";
    }
}

class Person{
    public void receive(IReceive iReceive){
        System.out.println(iReceive.getInfo());
    }
}