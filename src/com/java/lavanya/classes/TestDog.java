package com.java.lavanya.classes.testclasses;

import com.java.lavanya.classes.Dog;
public class TestDog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog d = new Dog("Balto", 3, 5.0);
		d.showDetails();
		System.out.println("Dog Details: " + d.showDetails());
		
		Dog d1= new Dog("Pooch",4);
		d1.getDogYears();
		System.out.println("Dog years: " + d1.getDogYears());
		d1.showDetails();
		System.out.println("Dog Details: " + d1.showDetails());

	}

}
