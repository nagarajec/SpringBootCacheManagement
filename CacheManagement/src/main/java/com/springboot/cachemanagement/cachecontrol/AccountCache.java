package com.springboot.cachemanagement.cachecontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.springboot.cachemanagement.model.Account;
import com.springboot.cachemanagement.repository.AccountRepository;

@Component
public class AccountCache {
	

	
	@Autowired
	AccountRepository accountRepository;

	@Cacheable(value="usersCache", key="#accountId", sync=true)
	public Account getAccountDetails(Long accountId) {
		System.out.println(" Retrieving Users Details for Account Id :"+accountId);
		return accountRepository.findByAccountId(accountId);
	}
	
	


	
	

}
