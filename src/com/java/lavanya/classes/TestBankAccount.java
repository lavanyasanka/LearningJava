package com.java.lavanya.classes.testclasses;

import com.java.lavanya.classes.BankAccount;

public class TestBankAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BankAccount LavanyaAccount = new BankAccount(12346,10000.0, 0.15);
		LavanyaAccount.withdraw(250.00);
		LavanyaAccount.deposit(400.00);
		LavanyaAccount.addInterest();
		System.out.println("Account Balance is "+LavanyaAccount.getBalance());
		LavanyaAccount.showDetails();
		System.out.println(LavanyaAccount.showDetails());
		
		
		BankAccount jointaccount = new BankAccount(702437,30000.00);
		jointaccount.deposit(8000.00);
		jointaccount.getBalance();
		System.out.println("Account Balance is "+jointaccount.getBalance());
		jointaccount.showDetails();
		System.out.println(jointaccount.showDetails());
	}

}
