package com.company.service.impl;

import com.company.model.Notification;
import com.company.service.INotificationService;

public class SmsNotification implements INotificationService {

    static final String DESCRIPTION = "SMS Notification is sending:";

    @Override
    public void sendNotification(Notification notification) {
        System.out.println(DESCRIPTION);
    }
}
