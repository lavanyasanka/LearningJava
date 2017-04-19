package com.java.lavanya.classes;

public class Library {
	private String title;
	private boolean borrowed;
	private boolean rented;
	
	//constructors
	public Library(String title) {
		super();
		this.title = title;
	}
	public Library(String title, boolean borrowed, boolean rented) {
		super();
		this.title = title;
		this.borrowed = borrowed;
		this.rented = rented;
	}
	public Library(String title, boolean borrowed) {
		super();
		this.title = title;
		this.borrowed = borrowed;
	}
	public Library()
	{
		
	}
	
	
	//setter and getter methods
	public boolean isBorrowed() {
		return borrowed;
	}
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
	public boolean isRented() {
		return rented;
	}
	public void setRented(){
		if(isRented())
		        this.rented = false;
		else
		        this.rented = true;}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String showDetails()
	{
		String details = "";
		details = title;
		details = details + "\n\tborrowed: " + borrowed;
		details = details + "\n\trented: " + rented;
		return details;
	}
}
