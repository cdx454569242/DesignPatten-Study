package Factory.Absfactory.Order;

import Factory.Absfactory.Pizza.*;

/**
 * @author
 * @create 2020-09-19 15:57
 */
public class SHFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new SHGreekPizza();
        }else if(orderType.equals("cheese")){
            pizza = new SHCheesPizza();
        }else{
            System.out.println("披萨不存在");
        }
        return pizza;
    }
}
