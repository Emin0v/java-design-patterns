package com.company;

import java.util.ArrayList;
import java.util.List;

public class Notification {

    private List<NotificationObserver> observers;
    private String message;

    public Notification(){
        this.observers = new ArrayList<>();
    }

    public void setMessage(String message){
        this.message = message;
        notifyObserver();
    }

    public String getMessage(){
        return this.message;
    }

    public void addObserver(NotificationObserver observer){
        this.observers.add(observer);
    }

    public void deleteObserver(NotificationObserver observer){
        this.observers.remove(observer);
    }

    public void notifyObserver(){
        for (NotificationObserver observer : observers){
            observer.update();
        }
    }

}
