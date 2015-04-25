package com.castronu.examples.configuration;

import com.castronu.examples.service.BookingService;
import com.castronu.examples.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by castronu on 22.04.15.
 */

@Configuration
@Import(DAOConfiugration.class)
public class ServiceConfiguration {

    @Autowired
    private DAOConfiugration daoConfiugration;

    @Bean
    public InvoiceService invoiceService() {
        InvoiceService invoiceService = new InvoiceService(daoConfiugration.invoiceDAO());
        return invoiceService;
    }

    @Bean
    public BookingService bookingService() {
        BookingService bookingService = new BookingService(daoConfiugration.reservationDAO());
        return bookingService;
    }

}
