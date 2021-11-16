package com.company;

import java.util.Date;

public class ChatRoomImpl implements ChatRoom{

    @Override
    public void showMessage(String message, Participant participant) {
        System.out.println(new Date().toString() + " [" + participant.getName() + "] : " + message);
    }
}
