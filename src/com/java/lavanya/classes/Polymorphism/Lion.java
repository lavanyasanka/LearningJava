package com.java.lavanya.classes;

public class Lion extends Animal {

	@Override
	public int calAge() {
		System.out.println("From calAge() of Lion");
		int lionsage= getAge()*10;
		System.out.println("Age is " +lionsage);
		return lionsage;
	}

}
