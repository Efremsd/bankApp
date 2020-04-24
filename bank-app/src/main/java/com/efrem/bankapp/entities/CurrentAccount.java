package com.efrem.bankapp.entities;


import java.util.Date;

public class CurrentAccount extends Account{

	private double overdraft;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String accountId, Date creationDate, double discount, Customer customer,
			double overdraft) {
		super(accountId, creationDate, discount, customer);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	
	
}
