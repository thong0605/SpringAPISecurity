package com.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.entities.Account;
import com.demo.entities.Role;
import com.demo.repositories.AccountRepository;

@Service("accountService")
public class AccountServiceImp implements AccountService{

	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Iterable<Account> findAll() {
		
		return accountRepository.findAll();
	}

	@Override
	public Account find(int id) {
		// TODO Auto-generated method stub
		return accountRepository.findById(id).get();
	}

	@Override
	public Account save(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

	@Override
	public boolean delete(int id) {
		try {
			accountRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Login 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountRepository.findByUsername(username);
		if(account == null ) {
			throw new UsernameNotFoundException("Username not found for" + username); 
		}
		List<GrantedAuthority> authories = new ArrayList<>();
		for(Role role : account.getRoles()) {
			authories.add(new SimpleGrantedAuthority(role.getName()));
		}
		return new User(account.getUsername() , account.getPassword() , authories);
	}
}
