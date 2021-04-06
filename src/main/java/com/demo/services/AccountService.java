package com.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.entities.Account;

public interface AccountService extends UserDetailsService{

	public Iterable<Account> findAll();

	public Account find(int id);

	public Account save(Account account);

	public boolean delete(int id);
}
