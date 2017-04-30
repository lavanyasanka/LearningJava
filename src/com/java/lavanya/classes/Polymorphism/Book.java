package com.java.lavanya.classes.polymorphism;

public class Book {

	private String author, title;
	private int id;


	public Book(String author, String title, int id) {
		super();
		this.author = author;
		this.title = title;
		this.id = id;
	}

	public Book() {
		super();
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void showDetails()
	{
		System.out.println("Title of the book is " + title);
		System.out.println("Author of  "+ title +" is " + author);
		System.out.println("Id of "+ title +" is "  + id);

	}


}
