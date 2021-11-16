package com.company;

public class User extends Participant {

    private String name;
    private ChatRoom chatRoom;

    public User(ChatRoom chatRoom){
        this.chatRoom =chatRoom;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void sendMessage(String message) {
        this.chatRoom.showMessage(message,this);
    }

}
