package com.company.framework;

public interface Event {

    Class<? extends Event> getType();

}
