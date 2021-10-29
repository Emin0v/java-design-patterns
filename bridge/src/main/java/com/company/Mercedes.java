package com.company;

import java.time.LocalDate;
import java.time.Month;


public class Mercedes extends Car{

    public Mercedes(Color color){
        super(color);
    }

    @Override
    void start() {
        System.out.println("Mercedes start");
    }

    @Override
    void speedUp() {
        System.out.println("Mercedes speedUp");
    }

    @Override
    void stop() {
        System.out.println("Mercedes stop");
    }

    @Override
    String getModel() {
        return "C200";
    }

    @Override
    CarType getType() {
        return CarType.SPORTS;
    }

    @Override
    LocalDate getDateOfProduction() {
        return LocalDate.of(2000, Month.MARCH, 30);
    }

    @Override
    void applyColor() {
        System.out.print("Mercedes painted: ");
        color.applyColor();
    }
}
