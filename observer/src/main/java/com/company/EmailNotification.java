package com.company;

public class EmailNotification extends NotificationObserver {

    public EmailNotification(Notification notification) {
        this.notification = notification;
        this.notification.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Email notification: " + notification.getMessage());
    }
}
