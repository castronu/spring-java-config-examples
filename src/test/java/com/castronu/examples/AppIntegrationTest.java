package com.castronu.examples;

import com.castronu.examples.configuration.DAOConfiugration;
import com.castronu.examples.configuration.ServiceConfiguration;
import com.castronu.examples.dao.ReservationDAO;
import com.castronu.examples.entity.Event;
import com.castronu.examples.entity.Reservation;
import com.castronu.examples.entity.User;
import com.castronu.examples.service.BookingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppIntegrationTestConfiguration.class)
public class AppIntegrationTest {

    @Autowired
    private BookingService bookingService;

    @Test
    public void bookTicketTest() {

        bookingService.bookTicket(new User("Jhon"), new Event("Festival"));

    }

}

@Configuration
@Import({ServiceConfiguration.class, DAOConfiugration.class})
class AppIntegrationTestConfiguration {

    @Bean
    public ReservationDAO reservationDAO() {
        ReservationDAO mock = Mockito.mock(ReservationDAO.class);
        when(mock.save(any(Reservation.class))).thenReturn(99);
        return mock;
    }

}
