package Adapter.ObjectAdapter;

/**
 * @author
 * @create 2020-09-20 18:59
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("对象适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
