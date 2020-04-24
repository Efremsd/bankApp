package com.efrem.bankapp.entities;

import java.util.Date;

public class SavingsAccount extends Account {
	
	private double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String accountId, Date creationDate, double discount, Customer customer, double interestRate) {
		super(accountId, creationDate, discount, customer);
		this.interestRate= interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	

}
