package Factory.FactoryMethod.Pizza;

/**
 *
 */
public class SHGreekPizza extends Pizza {
    @Override
    public void prepare() {
        name = "上海 希腊披萨";
        System.out.println("给 上海 希腊披萨准备原材料");
    }
}
