package com.company;

public class ShapeStateContext {

    private ShapeState state;

    public ShapeStateContext(){
        state = null;
    }

    public void setState(ShapeState state){
        this.state = state;
    }

    public ShapeState getState(){
        return state;
    }


}
