package Bridge.Brand;

/**
 * @author
 * @create 2020-09-20 20:13
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void cloase() {
        System.out.println("Vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
