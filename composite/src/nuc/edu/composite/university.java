package nuc.edu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/7/24 15:49
 */
public class university extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public university(String name, String description) {
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
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
