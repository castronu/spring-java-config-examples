package com.castronu.examples.entity;

/**
 * Created by castronu on 22.04.15.
 */
public class Reservation implements EasyTicketEntity {

    private final User user;

    private final Event event;

    public Reservation(User user, Event event) {
        this.user = user;
        this.event = event;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "user=" + user +
                ", event=" + event +
                '}';
    }

    public User getUser() {
        return user;
    }

    public Event getEvent() {
        return event;
    }
}
