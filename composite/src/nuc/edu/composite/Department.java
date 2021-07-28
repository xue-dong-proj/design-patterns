package nuc.edu.composite;

/**
 * @author 薛东
 * @date 2021/7/24 15:55
 */
public class Department extends OrganizationComponent{
    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
