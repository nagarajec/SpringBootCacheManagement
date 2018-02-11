package com.springboot.cachemanagement.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cachemanagement.cachecontrol.AccountCache;
import com.springboot.cachemanagement.model.Account;
import com.springboot.cachemanagement.repository.AccountRepository;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	AccountCache accountCache;
	
	@RequestMapping(value="/rest/account")
	public String hello()
	{
		return "Hellow World! nnnnn";
		
	}
	
	@RequestMapping(value="/rest/account/{accountId}")
	public Account getAccountDetails(@PathVariable Long accountId)
	{
		System.out.println(" accountid :"+accountId);
		//return accountRepository.findByAccountId(accountId);
		Account account = accountCache.getAccountDetails(accountId);
		if(account!=null)
		{
			return account;
		}
		else {
			System.out.println(" Account details does not exist for the account id:"+accountId);
			return null;
		}
		
	}
	
	
	
	

}
