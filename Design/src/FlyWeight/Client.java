package FlyWeight;

/**
 * @author
 * @create 2020-09-22 10:29
 */
public class Client {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("A用户");
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite web1 = webSiteFactory.getWebSite("新闻");
        web1.use(user1);
        WebSite web2 = webSiteFactory.getWebSite("博客");
        web2.use(user1);

        User user2 = new User();
        user2.setName("B用户");

        WebSite web3 = webSiteFactory.getWebSite("博客");
        web3.use(user2);
        WebSite web4 = webSiteFactory.getWebSite("博客");
        web4.use(user2);
        WebSite web5 = webSiteFactory.getWebSite("博客");
        web5.use(user2);

        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
