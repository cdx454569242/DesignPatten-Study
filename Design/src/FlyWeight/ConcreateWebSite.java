package FlyWeight;

/**
 * @author
 * @create 2020-09-22 10:23
 */
public class ConcreateWebSite extends WebSite{
    private String type = "";

    public ConcreateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为: " + type +" 使用用户为: " + user.getName());
    }
}
