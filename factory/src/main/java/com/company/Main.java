package com.company;

import com.company.model.Notification;
import com.company.model.NotificationType;

public class Main {
    public static void main(String[] args) {

        var emailNotification = NotificationFactory.getNotification(NotificationType.EMAIL);
        var smsNotification = NotificationFactory.getNotification(NotificationType.SMS);

        Notification notification = new Notification(
                "to.test@gmail.com",
                "from.test@gmail.com",
                "Hey There!"
        );
        emailNotification.sendNotification(notification);
    }
}
