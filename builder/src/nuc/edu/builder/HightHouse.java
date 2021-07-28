package nuc.edu.builder;

/**
 * @author 薛东
 * @date 2021/7/22 16:06
 */
public class HightHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("楼房打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("楼房砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("楼房盖屋顶");
    }
}
