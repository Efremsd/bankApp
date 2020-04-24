package com.efrem.bankapp.entities;

import java.util.Date;

public class WithdrawalOperation extends Operation {

	public WithdrawalOperation() {
		super();
	}

	public WithdrawalOperation(Date operationDate, double amount, Account account) {
		super(operationDate, amount, account);
	}

	
}
