package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shop {

    private List<Product> productList;

    public Shop() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public Iterator<Product> iterator(){
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator<Product> {

        private int index=0;

        @Override
        public boolean hasNext() {
            if (index >= productList.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Product next() {
            return productList.get(index++);
        }

    }
}
