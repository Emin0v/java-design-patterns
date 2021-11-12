package com.company;

import com.company.event.UserCreatedEvent;
import com.company.event.UserUpdatedEvent;
import com.company.framework.EventDispatcher;
import com.company.handler.UserCreatedEventHandler;
import com.company.handler.UserUpdatedEventHandler;
import com.company.model.User;

public class Main {

    public static void main(String[] args) {

        var dispatcher = new EventDispatcher();
        dispatcher.registerHandler(UserCreatedEvent.class, new UserCreatedEventHandler());
        dispatcher.registerHandler(UserUpdatedEvent.class, new UserUpdatedEventHandler());

        var user = new User("mahammademinov");

        dispatcher.dispatch(new UserCreatedEvent(user));
        dispatcher.dispatch(new UserUpdatedEvent(user));

    }
}
