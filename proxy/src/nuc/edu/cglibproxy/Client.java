package nuc.edu.cglibproxy;

/**
 * @author 薛东
 * @date 2021/7/26 15:03
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher proxyInstance = (Teacher) new ProxyFactory(teacher).getProxyInstance();
        proxyInstance.teach();
    }
}
