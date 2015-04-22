package com.castronu.examples.configuration;

import com.castronu.examples.dao.InvoiceDAO;
import com.castronu.examples.dao.ReservationDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by castronu on 22.04.15.
 */
@Configuration
public class DAOConfiugration {

    @Bean
    public ReservationDAO reservationDAO() {
        return new ReservationDAO();
    }

    @Bean
    public InvoiceDAO invoiceDAO() {
        return new InvoiceDAO();
    }

}
