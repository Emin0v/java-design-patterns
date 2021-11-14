package com.company;

public class Xiaomi extends Phone{

    public Xiaomi(String model){
        this.model = model;
    }

    @Override
    void turnOn() {
        System.out.printf("%s opened \n", model);
    }

    @Override
    void turnOff() {
        System.out.printf("%s closed \n", model);
    }

}
