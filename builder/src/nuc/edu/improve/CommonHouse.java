package nuc.edu.improve;

/**
 * @author 薛东
 * @date 2021/7/22 16:13
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("普通房子盖屋顶");
    }
}
