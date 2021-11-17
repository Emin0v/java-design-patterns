package com.company;

public class Main {

    public static void main(String[] args) {

        UserDAO userDAO = new UserDAOImpl();

        for (User user : userDAO.getAllUsers()){
            System.out.println(user);
        }

        System.out.println("Name = "+userDAO.getUser(1L));

        userDAO.getUser(1L).setName("TEST");

        System.out.println("Changed: Name = "+userDAO.getUser(1L));


    }
}
