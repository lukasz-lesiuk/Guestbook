package com.codecool.guestbook.dao;

import com.codecool.guestbook.model.User;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class GuestsDaoHardcoded implements GuestsDao {
    private List<User> users = Stream.of(
            new User(1, "Adam", "ble ble ble", new Date()),
            new User(2, "Asia", "la lal la", new Date()))
            .collect(Collectors.toList());

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
