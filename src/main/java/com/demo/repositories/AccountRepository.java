package com.demo.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Account;

@Repository("accountRepository")
public interface AccountRepository extends CrudRepository<Account, Integer>{
	
	@Query("from Account where username =:username ")
	public Account findByUsername(@Param("username") String username);
	
	
}
