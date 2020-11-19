package FlyWeight;

import java.util.HashMap;

/**
 * @author
 * @create 2020-09-22 10:25
 */
public class WebSiteFactory {
    private HashMap<String,ConcreateWebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreateWebSite(type));
        }
        return pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}
