package com.company;

public abstract class Phone {

    public String model;

    abstract void turnOn();
    abstract void turnOff();

    public final void clickButton(){
        turnOn();
        turnOff();
    }
}
