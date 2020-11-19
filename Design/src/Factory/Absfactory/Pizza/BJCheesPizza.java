package Factory.Absfactory.Pizza;

/**
 *
 */
public class BJCheesPizza extends Pizza {
    @Override
    public void prepare() {
        name = "北京 奶酪披萨";
        System.out.println("准备 北京 奶酪披萨的原材料");
    }
}
