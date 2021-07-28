package nuc.edu.builder;

/**
 * @author 薛东
 * @date 2021/7/22 16:07
 */
public class client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();

        System.out.println("========================");

        HightHouse hightHouse = new HightHouse();
        hightHouse.build();
    }
}
