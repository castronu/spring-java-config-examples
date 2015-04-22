package com.castronu.examples.services;

import com.castronu.examples.dao.InvoiceDAO;
import com.castronu.examples.entity.Invoice;
import com.castronu.examples.entity.Reservation;

/**
 * Created by castronu on 22.04.15.
 */
public class InvoiceService {

    private final InvoiceDAO invoiceDAO;

    public InvoiceService(InvoiceDAO invoiceDAO) {
        this.invoiceDAO = invoiceDAO;
    }

    public Invoice generateInvoice(Reservation reservation){
        Invoice invoice = new Invoice(reservation);
        //Generate invoice...
        invoiceDAO.save(invoice);
        return invoice;
    }
}
