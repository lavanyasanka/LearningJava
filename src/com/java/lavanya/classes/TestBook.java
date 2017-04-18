package com.java.lavanya.classes;

public class TestBook {
	public static void main(String[] args) {
		
		Book b = new Book();
		b.price = 120;
		b.title="Cat in the Hat";
		b.author = "Dr.Sesus";
		b.type = "Ficton";
		b.year =1970;
		b.publication = "Houghton Mifflin Harcourt";
	
		Book java = new Book();
		java.author ="Jonathan Knudsen";
		java.title = "Learning Java";
		java.year = 2000;
		java.price=30;
		java.type = "Non-fiction";
		java.publication ="O'Reilly Media";
		
		b.showBooks();
		b.booksByAutor();
		b.booksByPrice();
		b.booksByType();
		
		java.showBooks();
		java.booksByAutor();
		java.booksByPrice();
		java.booksByYear();

		
				
	}
}
class Book{
	int price;
	String author;
	String title;
	int year;
	String publication;
	String type;
	
	
	void booksByType(){
		System.out.println(title +" book is of " +type);
	}
	void booksByAutor(){
		System.out.println(title +" book is written by "+author);
	}
	
	void booksByYear(){
		System.out.println(title +" book is written in the  "+year);
	}
	void booksByPrice(){
		
		System.out.println(title +" book is " +price);
	}
	void showBooks(){
		System.out.println("book is of " +type);
		System.out.println("book is by " +author);
		System.out.println("book is " +title);
		System.out.println("book is in "+year);
		System.out.println("book is of"+ publication);
		System.out.println("book is of" +price);

	}
}