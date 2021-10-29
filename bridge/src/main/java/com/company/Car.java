package com.company;

import java.time.LocalDate;

public abstract class Car {

    protected  Color color;

    public Car(Color color){
        this.color = color;
    }

    abstract void start();

    abstract void speedUp();

    abstract void stop();

    abstract String getModel();

    abstract CarType getType();

    abstract LocalDate getDateOfProduction();

    abstract void applyColor();

}
