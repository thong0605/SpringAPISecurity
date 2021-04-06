package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Category;
import com.demo.entities.Invoice;
import com.demo.repositories.AccountRepository;
import com.demo.repositories.InvoiceRepository;

@Service("invoiceService")
public class InvoiceServiceImp implements InvoiceService{

	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Override
	public Iterable<Invoice> findAll() {
		
		return invoiceRepository.findAll();
	}

	@Override
	public Invoice find(int id) {
		// TODO Auto-generated method stub
		return invoiceRepository.findById(id).get();
	}

	@Override
	public Invoice save(Invoice invoice) {
		// TODO Auto-generated method stub
		return invoiceRepository.save(invoice);
	}

	@Override
	public boolean delete(int id) {
		try {
			invoiceRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
