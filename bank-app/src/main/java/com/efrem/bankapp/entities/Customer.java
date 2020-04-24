package com.efrem.bankapp.entities;

import java.io.Serializable;
import java.util.Collection;

public class Customer implements Serializable {

	private Long code;
	private String name;
	private String email;
	
	private Collection<Account> accounts;

	public Customer() {
		super();
			}

	public Customer(Long code, String name, String email, Collection<Account> accounts) {
		super();
		this.code = code;
		this.name = name;
		this.email = email;
		this.accounts = accounts;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Collection<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	
}
