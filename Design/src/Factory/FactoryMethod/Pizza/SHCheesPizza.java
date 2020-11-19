package Factory.FactoryMethod.Pizza;

/**
 *
 */
public class SHCheesPizza extends Pizza {
    @Override
    public void prepare() {
        name = "上海 奶酪披萨";
        System.out.println("准备 上海 奶酪披萨的原材料");
    }
}
