package Decorator.DecoratorPackage;

import Decorator.Drink;
/**
 * @author
 * @create 2020-09-21 18:40
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3f);
    }
}
