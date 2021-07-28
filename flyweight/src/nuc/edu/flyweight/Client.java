package nuc.edu.flyweight;

/**
 * @author 薛东
 * @date 2021/7/26 8:42
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));

        WebSite webSite2 = factory.getWebSiteCategory("博客");


        webSite2.use(new User("jack"));

// 客户要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");


        webSite3.use(new User("smith"));

// 客户要一个以博客形式发布的网站
        WebSite webSite4 = factory.getWebSiteCategory("博客");


        webSite4.use(new User("king"));

        System.out.println("网站的分类共=" + factory.getWebSiteSize());
    }
}
