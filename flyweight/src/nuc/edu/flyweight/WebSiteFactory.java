package nuc.edu.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 薛东
 * @date 2021/7/26 8:32
 */
public class WebSiteFactory {
    private Map<String,ConcreteWebSite> poll = new HashMap<>();

    public WebSite getWebSiteCategory(String type){
        if (!poll.containsKey(type)){
            poll.put(type,new ConcreteWebSite(type));
        }

        return (WebSite) poll.get(type);
    }

    public int getWebSiteSize(){
        return poll.size();
    }
}
