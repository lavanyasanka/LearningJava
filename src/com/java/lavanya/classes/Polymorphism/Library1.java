package com.java.lavanya.classes.polymorphism;

public class Library1 {
	private String borrower;
	private boolean rented;
	private Book book;
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
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Library1(String borrower, boolean rented) {
		super();
		this.borrower = borrower;
		this.rented = rented;
		//this.book = book;
	}
	public Library1() {
		super();
	}
	public void showDetails(){

		System.out.println("The Book is borrowed by " + borrower);
		System.out.println("Is the Book available  " + rented);
	}

}
