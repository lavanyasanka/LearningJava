package com.java.lavanya.classes;

public class BankAccount {
	private int bankAccountnum;
	private double balance;
	private double interest;
	
	//constructors
	public BankAccount(double balance, double interest) {
		super();

		this.balance = balance;
		this.interest = interest;
	}
	public BankAccount(int bankAccountnum, double balance) {
		super();
		this.bankAccountnum = bankAccountnum;
		this.balance = balance;
	}
	public BankAccount(int bankAccountnum, double balance, double interest) {
		super();
		this.bankAccountnum = bankAccountnum;
		this.balance = balance;
		this.interest = interest;
	}
	
	public BankAccount() {
		
	}
	
	//getter and setter methods
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getBankAccountnum() {
		return bankAccountnum;
	}
	public void setBankAccountnum(int bankAccountnum) {
		this.bankAccountnum = bankAccountnum;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}
	
	public String showDetails()
	{
		String details = "";
		details = "\n\t bankAccountnum: " + bankAccountnum;
		details = details + "\n\t balance: " + balance;
		details = details + "\n\t interest: " + interest;
		return details; 
	}
}
