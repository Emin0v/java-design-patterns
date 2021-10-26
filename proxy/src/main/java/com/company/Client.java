package com.company;

public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
           internet.connectTo("google.com");
           internet.connectTo("darkweb.com");

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
