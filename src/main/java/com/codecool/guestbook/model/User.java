package com.codecool.guestbook.model;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String message;
    private Date creationDate;

    public User(int id, String name, String message, Date creationDate) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
