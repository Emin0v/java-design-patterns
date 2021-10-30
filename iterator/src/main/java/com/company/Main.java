package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Book",5);
        Product product2 = new Product("Phone",1);
        Product product3 = new Product("Notebook",3);

        Shop shop = new Shop();
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        Iterator<Product> iterator = shop.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
