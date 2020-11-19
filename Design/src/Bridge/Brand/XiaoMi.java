package Bridge.Brand;

/**
 * @author
 * @create 2020-09-20 20:12
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void cloase() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
