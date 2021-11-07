package com.company;

public class Meat implements Eatable {

    public void eat() {
        System.out.println("The meat was eaten");
    }

    @Override
    public String toString() {
        return "Meat{}";
    }
}
