package nuc.edu.test1;

/**
 * @author 薛东
 * @date 2021/7/19 12:46
 */
public class singeleTest1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("跑车");
        vehicle.run("飞机");
        vehicle.run("轮船");

    }
}

class Vehicle{
    void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
}
