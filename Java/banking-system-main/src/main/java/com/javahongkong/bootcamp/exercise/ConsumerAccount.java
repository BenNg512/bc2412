package com.javahongkong.bootcamp.exercise;

public class ConsumerAccount extends Account {

	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		// complete the function
		this.accountHolder = person;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = currentBalance;

	}

}