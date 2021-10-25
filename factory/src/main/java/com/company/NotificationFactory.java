package com.company;

public class NotificationFactory {

    public static INotificationService getNotification(NotificationType type){
        return type.getSupplier().get();
    }
}
