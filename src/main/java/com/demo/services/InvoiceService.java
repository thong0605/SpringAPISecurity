package com.demo.services;

import com.demo.entities.Invoice;

public interface InvoiceService {

	
	public Iterable<Invoice> findAll();

	public Invoice find(int id);

	public Invoice save(Invoice invoice);

	public boolean delete(int id);
}
