package nuc.edu.dynamicproxy;

/**
 * @author 薛东
 * @date 2021/7/26 11:15
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
