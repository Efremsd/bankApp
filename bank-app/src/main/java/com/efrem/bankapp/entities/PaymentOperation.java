package com.efrem.bankapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "PO")
public class PaymentOperation extends Operation{

	public PaymentOperation() {
		super();
	}

	public PaymentOperation(Date operationDate,double amount, Account account) {
		super(operationDate,amount, account);
	}
	
	

}
