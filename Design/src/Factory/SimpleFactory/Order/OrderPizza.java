package Factory.SimpleFactory.Order;

import Factory.SimpleFactory.Pizza.Pizza;

import java.util.Scanner;

/**
 * 订购披萨
 */
public class OrderPizza {
    Pizza pizza = null;
    String orderType = "";

    public OrderPizza(){
        do{
            orderType = getType();
            pizza = SimpleFactory.createPizza(orderType);
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
