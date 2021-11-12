package com.company.handler;

import com.company.event.UserUpdatedEvent;
import com.company.framework.Handler;

public class UserUpdatedEventHandler implements Handler<UserUpdatedEvent> {

    @Override
    public void onEvent(UserUpdatedEvent event) {
        System.out.printf("User %s has been com.company.event \n", event.getUser().getUsername());
    }
}
