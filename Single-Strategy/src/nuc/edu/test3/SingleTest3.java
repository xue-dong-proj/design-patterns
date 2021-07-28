package nuc.edu.test3;

/**
 * @author 薛东
 * @date 2021/7/19 12:58
 */
public class SingleTest3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Water water = new Water();
        Ari ari = new Ari();

        vehicle.run("汽车");
        water.run("轮船");
        ari.run("飞机");
    }
}

class Vehicle{
    void run(String vehicle){
        System.out.println(vehicle + "在公路上运行....");
    }
}

class Water{
    void run(String vehicle){
        System.out.println(vehicle + "在海洋上运行....");
    }
}

class Ari{
    void run(String vehicle){
        System.out.println(vehicle + "在天空中运行....");
    }
}
