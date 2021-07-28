package nuc.edu.improve;

/**
 * @author 薛东
 * @date 2021/7/22 16:15
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        House house = houseDirector.constructHouse();

        System.out.println("================");
        HightHouse hightHouse = new HightHouse();
        houseDirector.setHouseBuilder(hightHouse);
        houseDirector.constructHouse();
    }
}
