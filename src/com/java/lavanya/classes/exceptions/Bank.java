package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

	//private int accountNumber;
	private float balance;
	float amount;

	// constructors
	public Bank() {
		super();
	}

	public Bank(float balance) {
		super();
		this.balance = balance;

	}

	//getter and setter methods
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	Scanner sc = new Scanner(System.in);

	public void verifyAccountg(){

		int option;

		System.out.println("Enter the Account Number");
		System.out.println("Enter the password");

		String pwd = sc.nextLine();

		if(pwd.equals("password")){

			System.out.println("Opening the account");
			System.out.println("Account opened");
			System.out.println("Please seclect ");
			System.out.println("1. withdraw"); 
			System.out.println("2 .deposit");

			option = sc.nextInt();
			if(option == 1){
				withdraw();
			}
			else if(option == 2){

				deposit();
			} 

			else
				System.out.println("Thanks for visiting come again soon......");
		}

		else{
			System.out.println("!! Wrong password !!");
		}
	}

	public float withdraw(){

		System.out.println("Enter the amount to withdraw");
		try{
			amount = sc.nextFloat();
		}
		catch(InputMismatchException ex){
			System.out.println("Something went wrong check please");
		}
		try{
			if (balance >= amount)
			{
				balance -= amount;
				System.out.println("Remaining balance in your account : " + balance);

			}
		
		else
			throw new InsufficientBalance("Insufficient balance in your account ");

	}catch(InsufficientBalance exp) {
		System.out.println(exp);
	}
	return balance;
}

public float deposit(){
	System.out.println("Enter the amount to Deposit");
	amount = sc.nextFloat();
	balance += amount;
	System.out.println("Remaining balance in your account : " + balance);
	return balance;
}

public static void main(String[] args) {

	Bank b = new Bank (1000.00f);
    b.verifyAccountg();


}
}
