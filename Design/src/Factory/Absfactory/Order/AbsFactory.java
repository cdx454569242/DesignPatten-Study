package Factory.Absfactory.Order;

import Factory.Absfactory.Pizza.Pizza;

/**
 * @author
 * @create 2020-09-19 15:54
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
