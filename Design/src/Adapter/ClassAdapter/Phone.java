package Adapter.ClassAdapter;

/**
 * @author
 * @create 2020-09-20 18:57
 */
public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V()==5){
            System.out.println("电压5V 可以充电");
        }else if(iVoltage5V.output5V()>5){
            System.out.println("电压大于5V ");
        }
    }
}
