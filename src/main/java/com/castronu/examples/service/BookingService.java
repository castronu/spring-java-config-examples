package com.castronu.examples.service;

import com.castronu.examples.dao.ReservationDAO;
import com.castronu.examples.entity.Event;
import com.castronu.examples.entity.Reservation;
import com.castronu.examples.entity.User;

/**
 * Created by castronu on 22.04.15.
 */
public class BookingService {

    private final ReservationDAO reservationDAO;

    public BookingService(ReservationDAO reservationDAO) {
        this.reservationDAO = reservationDAO;
    }

    public Reservation bookTicket(User user, Event event) {
        Reservation reservation = new Reservation(user, event);
        //Create reservation
        System.out.println(reservationDAO.save(reservation));
        return reservation;

    }
}
