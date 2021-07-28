package nuc.edu.test3;

/**
 * @author 薛东
 * @date 2021/7/19 16:40
 */
public class DependecyInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮箱信息：hello world!";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
