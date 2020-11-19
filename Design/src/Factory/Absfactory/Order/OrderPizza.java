package Factory.Absfactory.Order;

import Factory.Absfactory.Pizza.Pizza;

import java.util.Scanner;

/**
 * @author
 * @create 2020-09-19 15:59
 */
public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory){
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType;
        this.absFactory = factory;
        do{
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
            }else{
                System.out.println("披萨不存在");
                break;
            }
        }while(true);
    }

    private String getType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入披萨类型");
        return sc.nextLine();
    }
}
