package com.efrem.bankapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrem.bankapp.entities.Account;

//This interface is an extension of JpaRepository.java
// It is used to access the Account table which is associated at the java class Account 

public interface AccountRepository extends JpaRepository<Account, String>{

}
