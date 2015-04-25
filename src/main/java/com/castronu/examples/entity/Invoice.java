package com.castronu.examples.entity;

/**
 * Created by castronu on 22.04.15.
 */
public class Invoice implements EasyTicketEntity {

    private final Reservation reservation;

    public Invoice(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "reservation=" + reservation +
                '}';
    }

    public Reservation getReservation() {
        return reservation;
    }
}
