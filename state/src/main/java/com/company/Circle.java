package com.company;

public class Circle implements ShapeState{

    @Override
    public void draw(ShapeStateContext context) {
        System.out.println("Circle drawn");
        context.setState(this);
    }

    public String toString(){
        return "Circle State";
    }

}
