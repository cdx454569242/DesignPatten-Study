package Factory.Absfactory.Pizza;

/**
 *
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        name = "北京 希腊披萨";
        System.out.println("给 北京 希腊披萨准备原材料");
    }
}
