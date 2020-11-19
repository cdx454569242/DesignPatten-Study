package Decorator.DecoratorPackage;

import Decorator.Drink;

/**
 * @author
 * @create 2020-09-21 18:33
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj){
        this.obj = obj;
    }

    @Override
    public float cost(){
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDes(){
        return des + " " + getPrice() + " && " + obj.getDes();
    }
}
