package com.company;

public class Main {

    public static void main(String[] args) {

        ShapeStateContext context = new ShapeStateContext();

        Rectangle rectangle = new Rectangle();
        rectangle.draw(context);
        System.out.println(context.getState().toString());


        Circle circle = new Circle();
        circle.draw(context);
        System.out.println(context.getState().toString());
    }
}
