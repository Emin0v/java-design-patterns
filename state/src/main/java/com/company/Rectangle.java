package com.company;

public class Rectangle implements ShapeState{

    @Override
    public void draw(ShapeStateContext context) {
        System.out.println("Rectangle drawn");
        context.setState(this);
    }

    public String toString(){
        return "Rectangle State";
    }

}
