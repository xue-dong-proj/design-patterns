package nuc.edu.flyweight;

/**
 * @author 薛东
 * @date 2021/7/26 8:31
 */
public class ConcreteWebSite extends WebSite{
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user + "在使用" + type + "观看");
    }
}
