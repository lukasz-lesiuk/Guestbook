package com.codecool.guestbook.dto;

import com.codecool.guestbook.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserCreationDto {
    private List<User> users;

    public UserCreationDto() {
        this.users = new ArrayList<User>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
