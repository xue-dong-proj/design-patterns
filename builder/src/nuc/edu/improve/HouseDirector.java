package nuc.edu.improve;

/**
 * @author 薛东
 * @date 2021/7/22 16:14
 */
public class HouseDirector {
    HouseBuilder houseer = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseer = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseer = houseBuilder;
    }

    public House constructHouse(){
        houseer.buildBasic();
        houseer.buildWalls();
        houseer.buildRoofed();
        return houseer.buildHouse();
    }
}
