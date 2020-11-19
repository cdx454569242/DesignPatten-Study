package Factory.FactoryMethod.Order;
import Factory.FactoryMethod.Pizza.Pizza;

import java.util.Scanner;

/**
 * 订购披萨
 */
public abstract  class OrderPizza {


    public OrderPizza(){
        Pizza pizza = null;
        String orderType = "";
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
            }else{
                System.out.println("披萨不存在");
                break;
            }
        }while(true);
    }

    abstract Pizza createPizza(String orderType);

    private String getType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入披萨类型");
        return sc.nextLine();
    }
}
