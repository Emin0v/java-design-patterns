package com.company;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        User user = new User.Builder()
                .uuid(UUID.randomUUID().toString())
                .name("Mahammad")
                .surname("Eminov")
                .email("eminov.mahammad@mail.ru")
                .build();

        System.out.println(user);
    }
}
