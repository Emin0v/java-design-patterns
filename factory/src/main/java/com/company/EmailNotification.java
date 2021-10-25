package com.company;

public class EmailNotification implements INotificationService{

    static final String DESCRIPTION = "Email Notification is sending: ";

    @Override
    public void sendNotification(Notification notification) {
        System.out.println(DESCRIPTION+notification);
    }
}
