package Decorator.Coffee;

import Decorator.Drink;

/**
 * @author
 * @create 2020-09-21 18:26
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
