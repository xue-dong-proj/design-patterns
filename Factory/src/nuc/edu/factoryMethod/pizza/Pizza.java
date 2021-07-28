package nuc.edu.factoryMethod.pizza;

/**
 * @author 薛东
 * @date 2021/7/21 14:44
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name + "baking...");
    }

    public void cut(){
        System.out.println(name + "cutting...");
    }

    public void box(){
        System.out.println(name + "boxing...");
    }
}
