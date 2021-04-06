package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Product;
import com.demo.entities.Role;
import com.demo.repositories.AccountRepository;
import com.demo.repositories.InvoiceDetailsRepository;
import com.demo.repositories.InvoiceRepository;
import com.demo.repositories.ProductRepository;
import com.demo.repositories.RoleRepository;

@Service("roleService")
public class RoleServiceImp implements RoleService{

	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public Iterable<Role> findAll() {
		
		return roleRepository.findAll();
	}

	@Override
	public Role find(int id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).get();
	}

	@Override
	public Role save(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public boolean delete(int id) {
		try {
			roleRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
