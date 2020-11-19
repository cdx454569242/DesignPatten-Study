package Factory.Absfactory.Order;

/**
 * @author
 * @create 2020-09-19 16:06
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
