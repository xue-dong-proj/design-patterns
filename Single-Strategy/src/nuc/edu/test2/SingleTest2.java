package nuc.edu.test2;

/**
 * @author 薛东
 * @date 2021/7/19 12:51
 */
public class SingleTest2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleRun("汽车");
        vehicle.waterRun("轮船");
        vehicle.airRun("飞机");
    }
}

class Vehicle{
    void vehicleRun(String vehicle){
        System.out.println(vehicle + "在公路上运行....");
    }

    void waterRun(String vehicle){
        System.out.println(vehicle + "在海洋上运行....");
    }

    void airRun(String vehicle){
        System.out.println(vehicle + "在天空中运行....");
    }
}
