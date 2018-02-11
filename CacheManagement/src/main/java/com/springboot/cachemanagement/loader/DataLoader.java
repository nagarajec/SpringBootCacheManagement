package com.springboot.cachemanagement.loader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.cachemanagement.model.Account;
import com.springboot.cachemanagement.repository.AccountRepository;

@Component
public class DataLoader {
	
	@Autowired
	AccountRepository accountRepository;
		
	@PostConstruct
	public void load()
	{
		List<Account> accountList = getList();
		accountRepository.save(accountList);
	}

	private List<Account> getList() {
		List<Account> accountList = new ArrayList<>();
		accountList.add(new Account(1234L,"John","Smith","Richmond","Virginia"));
		accountList.add(new Account(5678L,"Mary","Angella","Carson City","Nevada"));
		accountList.add(new Account(987L,"Sanjay","Bhandari","Trenton","New Jersy"));
		accountList.add(new Account(6598L,"Harry","Potter","Seattle","Washington"));
		accountList.add(new Account(55647L,"Robert","Vahn","Raleigh","North Carolina"));
		return accountList;
	}
	

}
