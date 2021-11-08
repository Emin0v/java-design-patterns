package com.company;

public class SmsNotification extends NotificationObserver {

    public SmsNotification(Notification notification) {
        this.notification = notification;
        this.notification.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Sms notification: " + notification.getMessage());
    }
}
