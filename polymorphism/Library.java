package com.java.lavanya.classes.polymorphism;

public class Library  {

	private String borrower;
	private boolean rented;
	private Book pustak[]= new Book[4];

	//getter and setter methods
	public Library(String borrower, boolean rented) {
		super();
		this.borrower = borrower;
		this.rented = rented;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public boolean isRented() {
		return rented;
	}
	public void setRented(boolean rented) {
		this.rented = rented;
	}
	public Book[] getPustak() {
		return pustak;
	}
	public void setPustak(Book[] pustak) {
		this.pustak = pustak;
	}
	public Library() {
		super();
	}

	public void showDetails(){

		System.out.println("The Book is borrowed by " + borrower);
		System.out.println("Is the Book available  " + rented);
	}


}
