package com.company;

public class Main {

    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoomImpl();

        User user = new User(chatRoom);
        user.setName("Mahammad");
        user.sendMessage("Hello World!");

    }

}
