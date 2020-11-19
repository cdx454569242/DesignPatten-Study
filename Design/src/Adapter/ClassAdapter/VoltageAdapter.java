package Adapter.ClassAdapter;

/**
 * @author
 * @create 2020-09-20 18:55
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        //适配操作
       int srcV = output220V();
       //将220V电压转换为5V 适配手机充电器
       int dst= srcV/44;
       return dst;
    }
}
