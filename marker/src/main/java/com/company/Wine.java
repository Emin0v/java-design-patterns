package com.company;


public class Wine implements Drinkable {

    @Override
    public void drink() {
        System.out.println("Wine was drunk");
    }

    @Override
    public String toString() {
        return "Wine{}";
    }
}
