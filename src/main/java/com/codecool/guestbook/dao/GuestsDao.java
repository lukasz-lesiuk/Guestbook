package com.codecool.guestbook.dao;

import com.codecool.guestbook.model.User;

import java.util.List;

public interface GuestsDao {
    List<User> getUsers();
    void addUser(User user);
}
