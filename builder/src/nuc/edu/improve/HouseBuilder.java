package nuc.edu.improve;

/**
 * @author 薛东
 * @date 2021/7/22 16:11
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void buildRoofed();

    public House buildHouse(){
        return house;
    }
}
