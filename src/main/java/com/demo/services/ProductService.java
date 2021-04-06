package com.demo.services;

import java.util.List;

import com.demo.entities.Product;

public interface ProductService {

	
	public Iterable<Product> findAll();

	public Product find(int id);

	public Product save(Product product);

	public boolean delete(int id);
	
	public List<Product> findByFeatured(boolean featured, int n);
	
	public List<Product> lastedProduct(int n);
}
