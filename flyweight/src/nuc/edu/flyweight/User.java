package nuc.edu.flyweight;

/**
 * @author 薛东
 * @date 2021/7/26 8:30
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
