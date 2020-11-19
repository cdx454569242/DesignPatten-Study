package Factory.FactoryMethod.Order;

import Factory.FactoryMethod.Pizza.*;


/**
 * @author
 * @create 2020-09-19 15:27
 */
public class SHOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new SHCheesPizza();
        }else if(orderType.equals("greek")){
            pizza = new SHGreekPizza();
        }
        return pizza;
    }
}
