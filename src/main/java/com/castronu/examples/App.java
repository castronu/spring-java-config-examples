package com.castronu.examples;

import com.castronu.examples.configuration.ServiceConfiguration;
import com.castronu.examples.entity.Event;
import com.castronu.examples.entity.Reservation;
import com.castronu.examples.entity.User;
import com.castronu.examples.service.BookingService;
import com.castronu.examples.service.InvoiceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfiguration.class);

        BookingService bookingService = context.getBean(BookingService.class);
        InvoiceService invoiceService = context.getBean(InvoiceService.class);

        Reservation reservation = bookingService.bookTicket(new User("John Doe"), new Event("Paleo Festival"));
        invoiceService.generateInvoice(reservation);

        context.close();

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/service-configuration.xml");
        ctx.close();
    }
}
