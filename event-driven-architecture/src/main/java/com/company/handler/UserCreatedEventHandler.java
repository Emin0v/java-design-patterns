package com.company.handler;

import com.company.event.UserCreatedEvent;
import com.company.framework.Handler;

public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {

    @Override
    public void onEvent(UserCreatedEvent event) {
        System.out.printf("User %s has been created \n", event.getUser().getUsername());
    }

}
