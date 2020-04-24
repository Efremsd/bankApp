package com.efrem.bankapp.entities;

import java.io.Serializable;
import java.util.Date;

public abstract class Operation implements Serializable {

	private Long number;
	
	private Date operationDate;
	private double amount;
	
	private Account account;

	
	public Operation() {
		super();
	}


	public Operation(Date operationDate,double amount, Account account) {
		super();
		this.operationDate = operationDate;
		this.amount=amount;
		this.account = account;
	}


	public Long getNumber() {
		return number;
	}


	public void setNumber(Long number) {
		this.number = number;
	}


	public Date getOperationDate() {
		return operationDate;
	}


	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
