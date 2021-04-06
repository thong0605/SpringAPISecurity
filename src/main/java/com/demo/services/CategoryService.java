package com.demo.services;

import com.demo.entities.Category;

public interface CategoryService {

	
	public Iterable<Category> findAll();

	public Category find(int id);

	public Category save(Category category);

	public boolean delete(int id);
}
