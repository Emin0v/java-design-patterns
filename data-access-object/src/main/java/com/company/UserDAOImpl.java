package com.company;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{

    private List<User> users;

    public UserDAOImpl(){
        this.users = new ArrayList<>();
        users.add(new User(1L,"Mahammad","Eminov"));
        users.add(new User(2L,"Test","Test"));
    }


    @Override
    public List<User> getAllUsers() {
        return this.users;
    }

    @Override
    public User getUser(Long id) {
        for (User user : users){
            if (user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
