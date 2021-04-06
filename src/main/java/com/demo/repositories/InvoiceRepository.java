package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Invoice;

@Repository("invoiceRepository")
public interface InvoiceRepository extends CrudRepository<Invoice, Integer>{

}
