package Factory.SimpleFactory.Order;

import Factory.SimpleFactory.Pizza.CheesPizza;
import Factory.SimpleFactory.Pizza.GreekPizza;
import Factory.SimpleFactory.Pizza.Pizza;

/**
 * @author
 * @create 2020-09-19 14:48
 */
public class SimpleFactory {
    //根据orderType返回对应的Pizza
    public static Pizza createPizza(String orderType){

        Pizza pizza = null;

        System.out.println("使用简单工厂模式制造披萨");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesPizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
