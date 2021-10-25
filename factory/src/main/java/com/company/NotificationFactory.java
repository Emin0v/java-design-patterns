package com.company;

import com.company.model.NotificationType;
import com.company.service.INotificationService;

public class NotificationFactory {

    public static INotificationService getNotification(NotificationType type){
        return type.getSupplier().get();
    }
}
