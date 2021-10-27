package com.company;

public class DrivableAdapterImpl implements DrivableAdapter{

    private final Drivable drivable;

    public DrivableAdapterImpl(Drivable drivable){
        this.drivable = drivable;
    }

    @Override
    public double getSpeed() {
        return drivable.getWheelCount();
    }
}
