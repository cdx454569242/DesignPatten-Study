package Factory.FactoryMethod.Order;

import Factory.FactoryMethod.Pizza.BJCheesPizza;
import Factory.FactoryMethod.Pizza.BJGreekPizza;
import Factory.FactoryMethod.Pizza.Pizza;


/**
 * @author
 * @create 2020-09-19 15:27
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesPizza();
        }else if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
