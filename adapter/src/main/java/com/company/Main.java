package com.company;

public class Main {

    public static void main(String[] args) {
        Drivable drivable = new Bicycle();
        DrivableAdapter adapter = new DrivableAdapterImpl(drivable);

        System.out.println(adapter.getSpeed());
    }
}
