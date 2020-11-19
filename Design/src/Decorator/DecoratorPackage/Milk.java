package Decorator.DecoratorPackage;

import Decorator.Drink;

/**
 * @author
 * @create 2020-09-21 18:41
 */
public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2f);
    }
}
