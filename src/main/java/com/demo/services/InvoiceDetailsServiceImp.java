package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Category;
import com.demo.entities.InvoiceDetails;
import com.demo.entities.InvoiceDetailsId;
import com.demo.repositories.AccountRepository;
import com.demo.repositories.InvoiceDetailsRepository;
import com.demo.repositories.InvoiceRepository;

@Service("invoiceDetailsService")
public class InvoiceDetailsServiceImp implements InvoiceDetailsService{

	
	@Autowired
	private InvoiceDetailsRepository invoiceDetailsRepository;

	@Override
	public Iterable<InvoiceDetails> findAll() {
		// TODO Auto-generated method stub
		return invoiceDetailsRepository.findAll();
	}

	@Override
	public InvoiceDetails find(InvoiceDetailsId invoiceDetailsId) {
		// TODO Auto-generated method stub
		return invoiceDetailsRepository.findById(invoiceDetailsId).get();
	}

	@Override
	public InvoiceDetails save(InvoiceDetails invoiceDetails) {
		// TODO Auto-generated method stub
		return invoiceDetailsRepository.save(invoiceDetails);
	}

	@Override
	public boolean delete(InvoiceDetailsId invoiceDetailsId) {
		try {
			invoiceDetailsRepository.deleteById(invoiceDetailsId);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	

	
}
