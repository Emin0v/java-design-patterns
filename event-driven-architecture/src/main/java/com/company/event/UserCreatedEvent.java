package com.company.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import com.company.model.User;

@RequiredArgsConstructor
@Getter
public class UserCreatedEvent extends AbstractEvent {

    private final User user;

}
