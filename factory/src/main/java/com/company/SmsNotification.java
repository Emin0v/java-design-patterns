package com.company;

public class SmsNotification implements INotificationService{

    static final String DESCRIPTION = "SMS Notification is sending:";

    @Override
    public void sendNotification(Notification notification) {
        System.out.println(DESCRIPTION);
    }
}
