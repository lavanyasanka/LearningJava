package com.java.lavanya.classes.polymorphism;

public class TestHasARelation {

	public static void main(String[] args) {

		Book b = new Book("Dan Brown "," The Da Vinci Code ",111);	
		Book b1 = new Book("Dr Shela "," The Lord of the Rings ",112);
		Book b2 = new Book("Dr Sesus "," The cat in the Hat ",113);
		Library lib = new Library("Lavanya",false);


		lib.setPustak(new Book[] {b,b1,b2});
		lib.showDetails();

		Book mybook[] = lib.getPustak();
		for (int i=0;i< mybook.length;i++ ){
			mybook[i].showDetails();
			//lib.getPustak().showDetails();
		}


	}



}
