package com.company.model;

import com.company.service.INotificationService;
import com.company.service.impl.EmailNotification;
import com.company.service.impl.SmsNotification;
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
