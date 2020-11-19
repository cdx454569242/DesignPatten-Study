package Singleresponsibility;

//单一职责演示

// 交通工具类
// 方式 1
// 1. 在方式 1 的 run 方法中， 违反了单一职责原则
// 2. 解决的方案非常的简单，根据交通工具运行方法不同，分解成不同类即可
public class SingleResponibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上行驶");
    }
}
