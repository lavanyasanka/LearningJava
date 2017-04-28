package com.java.lavanya.classes;

public class Dog extends Animal {

	private String color;


	//constructors
	public Dog(String eat, int age, String name) {
		super(eat, age, name);
	}

	public Dog(String eat, int age, String name, String color) {
		super(eat, age, name);
		this.color = color;
	}

	public Dog() {
		super();

	}

	// getter and setter methods

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int calAge() {
		System.out.println("From calAge() of Dog");
		int dogsage= getAge()*5;
		System.out.println("Age is " + dogsage);
		return dogsage;
	}


}
