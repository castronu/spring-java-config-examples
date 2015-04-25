package com.castronu.examples.entity;

/**
 * Created by castronu on 22.04.15.
 */
public class Event implements EasyTicketEntity {

    private final String title;

    public Event(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                '}';
    }
}
