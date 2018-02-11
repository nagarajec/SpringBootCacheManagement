package com.springboot.cachemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.cachemanagement.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

	Account findByAccountId(Long accountId);
	
	
	
	

}
