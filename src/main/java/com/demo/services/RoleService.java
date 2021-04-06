package com.demo.services;

import com.demo.entities.Role;

public interface RoleService {

	public Iterable<Role> findAll();

	public Role find(int id);

	public Role save(Role role);

	public boolean delete(int id);
}
