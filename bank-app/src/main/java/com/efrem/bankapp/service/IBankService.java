package com.efrem.bankapp.service;

import org.springframework.data.domain.Page;

import com.efrem.bankapp.entities.Account;
import com.efrem.bankapp.entities.Operation;

//This interface provide the functional requirement of the bank
 
public interface IBankService {

	
	public Account getAccountById(String accountId);
	
	//It is used to add the specified amount at the discount of the specified account
	public void payToAccount(String accountId, double amount);
	
	// This method is used to remove the specified amount from the specified account
	public void removeFromAccount(String accountId, double amount);
	
	// This method is used to make a transfer between two account.
	public void transfer(String accountOriginId, String accountDestId, double amount);
	
	//This method is used to get operation of the specified account by page
	public Page<Operation> getAccountOperationByPage(String accountId, int page, int size);

	}


