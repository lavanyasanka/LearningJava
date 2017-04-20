package com.java.lavanya.classes.testclasses;
import com.java.lavanya.classes.Dog;

public class TestDog {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog bullDog = new Dog("walk","dream","meat","BullDog",5);
		//bullDog.getDogYears();
		//bullDog.getName();
		System.out.println("Name is : " + bullDog.getName());
		System.out.println("Age is : " + bullDog.getDogYears());
		bullDog.showDetails();
	}
	
}
