package com.java.lavanya.classes.testclasses;
import com.java.lavanya.classes.Library;

public class TestLibrary {
	
	public static void main(String[] args) {
	
		Library myBook = new Library();
		myBook.setTitle( "The Da Vinci Code");
		System.out.println("Title: " + myBook.getTitle()); 
		myBook.setBorrowed(false);
		System.out.println("rented? : " + myBook.isBorrowed());
		myBook.setRented();
		System.out.println("rented?: " + myBook.isRented());
		myBook.setRented();
		System.out.println("rented?: " + myBook.isBorrowed());
		
		Library book = new Library();
		book.setTitle( "A Tale of Two Cities");
		System.out.println("Title: " + book.getTitle());
		book.setBorrowed(false);
		System.out.println("rented? : " + book.isBorrowed());
	    book.setRented();
		System.out.println("rented?: " + book.isRented());
		book.setRented();
		System.out.println("rented?: " + book.isBorrowed());
		
		
		Library book1 = new Library();
		book1.setTitle( "The Lord of the Rings");
		System.out.println("Title: " + book1.getTitle()); 
	    book1.setBorrowed(true);
		System.out.println("rented? : " + book1.isBorrowed());

		System.out.println("rented?: " + book1.isRented());
		book1.setRented();
		System.out.println("rented?: " + book1.isBorrowed());
	}

}
