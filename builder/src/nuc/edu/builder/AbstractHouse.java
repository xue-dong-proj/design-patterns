package nuc.edu.builder;

/**
 * @author 薛东
 * @date 2021/7/22 16:04
 */
public abstract class AbstractHouse {
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
