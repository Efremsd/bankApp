package com.efrem.bankapp.entities;

import java.util.Date;

public class PaymentOperation extends Operation{

	public PaymentOperation() {
		super();
	}

	public PaymentOperation(Date operationDate,double amount, Account account) {
		super(operationDate,amount, account);
	}
	
	

}
