package nuc.edu.visitor;

/**
 * @author θδΈ
 * @date 2021/7/27 12:38
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructers objectStructure = new ObjectStructers();


        objectStructure.attach(new Man());
        objectStructure.attach(new Women());


//ζε
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("===============");
        Fail fail = new Fail(); objectStructure.display(fail);
    }
}
