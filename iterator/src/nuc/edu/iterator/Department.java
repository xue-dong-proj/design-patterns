package nuc.edu.iterator;

/**
 * @author 薛东
 * @date 2021/7/27 19:20
 */
public class Department {
    private String name;
    private String description;

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
