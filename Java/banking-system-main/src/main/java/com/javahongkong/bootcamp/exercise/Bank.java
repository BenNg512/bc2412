package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;
	private Company company;
	private Person person;
	private Long accountNumber = 123_456_7890_0001L;
	

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<Long, Account>();
		
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		// contains tax id
		accountNumber += 1L;
		this.accounts.put(accountNumber, new CommercialAccount(company, accountNumber, pin, startingDeposit) );
		return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		// contains id num 
		accountNumber += 1L;
		this.accounts.put(accountNumber, new ConsumerAccount(person, accountNumber, pin, startingDeposit) );
		return accountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		if (accounts.get(accountNumber).validatePin(pin)){
			return true;
		}
		return false;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		return this.accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		if (this.accounts.get(accountNumber).getBalance() >= amount) {
			this.accounts.get(accountNumber).debitAccount(amount);
			return true;
		}
		return false;
	}
}
