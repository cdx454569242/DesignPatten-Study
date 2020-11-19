package Decorator;

import Decorator.Coffee.LongBlack;
import Decorator.DecoratorPackage.Chocolate;
import Decorator.DecoratorPackage.Milk;

/**
 * @author
 * @create 2020-09-21 18:43
 */
public class CofferBar {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("描述:" + order.getDes());
        System.out.println("总价格: " + order.cost());

        order = new Milk(order);
        System.out.println("描述:" + order.getDes());
        System.out.println("总价格: " + order.cost());

        order = new Chocolate(order);
        System.out.println("描述:" + order.getDes());
        System.out.println("总价格: " + order.cost());

    }
}
