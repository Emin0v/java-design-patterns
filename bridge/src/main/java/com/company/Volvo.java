package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Volvo extends Car{

    public Volvo(Color color){
        super(color);
    }

    @Override
    void start() {
        System.out.println("Volvo start");
    }

    @Override
    void speedUp() {
        System.out.println("Volvo speed up");
    }

    @Override
    void stop() {
        System.out.println("Volvo stop");
    }

    @Override
    String getModel() {
        return "C90";
    }

    @Override
    CarType getType() {
        return CarType.SEDAN;
    }

    @Override
    LocalDate getDateOfProduction() {
        return LocalDate.of(2012, Month.NOVEMBER, 15);
    }

    @Override
    void applyColor() {
        System.out.print("Volvo painted: ");
        color.applyColor();
    }
}
