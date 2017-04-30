package com.java.lavanya.classes.polymorphism;

public class TestLibrary1 {

	public static void main(String[] args) {
		Library1 libra = new Library1("Arnav", true);
		Book b = new Book("Dr Shela "," The Lord of the Rings ",1104);
		libra.setBook(b);
		libra.showDetails();
		libra.getBook().showDetails();
	}
}
