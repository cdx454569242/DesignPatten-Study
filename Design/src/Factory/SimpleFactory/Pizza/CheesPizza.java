package Factory.SimpleFactory.Pizza;

/**
 *
 */
public class CheesPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨的原材料");
    }
}
