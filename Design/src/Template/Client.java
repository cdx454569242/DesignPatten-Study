package Template;

/**
 * @author
 * @create 2020-09-22 15:49
 */
public class Client {
    public static void main(String[] args) {
        SoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println("-------------------------------");

        SoyMilk blackBeanSoyMilk = new BlackBeanSoyMilk();
        blackBeanSoyMilk.make();
    }
}
