package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
         User user = new User(5,"Mahammad", BigDecimal.valueOf(500));

        System.out.println(user);

        System.out.println("----------------------------");

        User u2 = (User)user.getClone();

        System.out.println(u2);
    }
}
