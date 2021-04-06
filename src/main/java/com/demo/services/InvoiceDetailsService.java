package com.demo.services;

import com.demo.entities.InvoiceDetails;
import com.demo.entities.InvoiceDetailsId;

public interface InvoiceDetailsService {

	
	public Iterable<InvoiceDetails> findAll();

	public InvoiceDetails find(InvoiceDetailsId invoiceDetailsId);

	public InvoiceDetails save(InvoiceDetails invoiceDetails);

	public boolean delete(InvoiceDetailsId invoiceDetailsId);
}
