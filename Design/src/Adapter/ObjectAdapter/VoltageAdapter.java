package Adapter.ObjectAdapter;

/**
 * @author
 * @create 2020-09-20 18:55
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst= 0;

        if(voltage220V!=null){
            //适配操作
            int srcV = voltage220V.output220V();
            //将220V电压转换为5V 适配手机充电器
            dst = srcV/44;
            System.out.println("电压适配完成");
        }
       return dst;
    }
}
