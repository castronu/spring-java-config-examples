package com.castronu.examples.entity;

/**
 * Created by castronu on 22.04.15.
 */
public class User implements EasyTicketEntity {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
