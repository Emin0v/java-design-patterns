package com.company;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();
    User getUser(Long id);
}
