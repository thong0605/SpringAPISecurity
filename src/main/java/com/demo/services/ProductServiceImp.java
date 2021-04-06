package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Invoice;
import com.demo.entities.Product;
import com.demo.repositories.AccountRepository;
import com.demo.repositories.InvoiceDetailsRepository;
import com.demo.repositories.InvoiceRepository;
import com.demo.repositories.ProductRepository;

@Service("productService")
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Iterable<Product> findAll() {

		return productRepository.findAll();
	}

	@Override
	public Product find(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public boolean delete(int id) {
		try {
			productRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Product> findByFeatured(boolean featured, int n) {

		return productRepository.findByFeatured(featured, n);
	}

	@Override
	public List<Product> lastedProduct(int n) {

		return productRepository.lastedProduct(n);
	}
}
