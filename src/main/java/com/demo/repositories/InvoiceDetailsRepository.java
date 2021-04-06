package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.demo.entities.InvoiceDetails;
import com.demo.entities.InvoiceDetailsId;

@Repository("invoiceDetailsRepository")
public interface InvoiceDetailsRepository extends CrudRepository<InvoiceDetails, InvoiceDetailsId>{

}
