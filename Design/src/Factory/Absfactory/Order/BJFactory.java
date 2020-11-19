package Factory.Absfactory.Order;

import Factory.Absfactory.Pizza.BJCheesPizza;
import Factory.Absfactory.Pizza.BJGreekPizza;
import Factory.Absfactory.Pizza.Pizza;

/**
 * @author
 * @create 2020-09-19 15:55
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }else if(orderType.equals("cheese")){
            pizza = new BJCheesPizza();
        }else{
            System.out.println("披萨不存在");
        }
        return pizza;
    }
}
