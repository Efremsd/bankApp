package com.efrem.bankapp.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public  abstract class Account implements Serializable {
	
private String accountId;

private Date creationDate;

private double discount;

private Customer customer;

private Collection<Operation> operations;
public Account() {
	super();
	}


public Account(String accountId, Date creationDate, double discount, Customer customer) {
	super();
	this.accountId = accountId;
	this.creationDate = creationDate;
	this.discount = discount;
	this.customer = customer;
}


public String getAccountId() {
	return accountId;
}

public void setAccountId(String accountId) {
	this.accountId = accountId;
}

public Date getCreationDate() {
	return creationDate;
}

public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}

public double getDiscount() {
	return discount;
}

public void setDiscount(double discount) {
	this.discount = discount;
}


public Customer getCustomer() {
	return customer;
}


public void setCustomer(Customer customer) {
	this.customer = customer;
}


public Collection<Operation> getOperations() {
	return operations;
}


public void setOperations(Collection<Operation> operations) {
	this.operations = operations;
}


}
