package com.company;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum NotificationType {

    SMS(SmsNotification::new),
    EMAIL(EmailNotification::new);

    private final Supplier<INotificationService> supplier;
}
