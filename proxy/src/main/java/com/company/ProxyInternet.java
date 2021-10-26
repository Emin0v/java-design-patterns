package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("shopping.com");
        bannedSites.add("darkweb.com");

    }

    @Override
    public void connectTo(String host) throws Exception {
        host=host.toLowerCase();
        for (String site : bannedSites){
            if (site.equals(host)){
                throw new IllegalAccessError("Access Denied");
            }
        }
        internet.connectTo(host);

    }
}
