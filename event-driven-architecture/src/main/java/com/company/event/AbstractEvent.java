package com.company.event;


import com.company.framework.Event;

public abstract class AbstractEvent implements Event {

    public Class<? extends Event> getType(){
        return getClass();
    };
}
