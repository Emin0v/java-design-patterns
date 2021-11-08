package com.company;

public class Main {

    public static void main(String[] args) {
        Notification notification = new Notification();

        new EmailNotification(notification);
        new SmsNotification(notification);

        System.out.println("Message added");
        notification.setMessage("Hello");

        System.out.println("Message changed");
        notification.setMessage("Hello World!");

    }
}
