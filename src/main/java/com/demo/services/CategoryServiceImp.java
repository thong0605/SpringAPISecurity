package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Account;
import com.demo.entities.Category;
import com.demo.repositories.AccountRepository;
import com.demo.repositories.CategoryRepository;

@Service("categoryService")
public class CategoryServiceImp implements CategoryService{

	
	@Autowired
	private CategoryRepository categoryRepository;


	@Override
	public Iterable<Category> findAll() {
		
		return categoryRepository.findAll();
	}

	@Override
	public Category find(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category save(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public boolean delete(int id) {
		try {
			categoryRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
