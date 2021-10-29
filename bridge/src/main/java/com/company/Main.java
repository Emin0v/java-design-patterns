package com.company;

public class Main {

    public static void main(String[] args) {

        Car mercedes = new Mercedes(new BlackColor());
        mercedes.applyColor();

        Car volvo = new Volvo(new WhiteColor());
        volvo.applyColor();
    }
}
