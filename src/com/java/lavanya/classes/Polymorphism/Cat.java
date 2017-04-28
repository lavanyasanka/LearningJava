package com.java.lavanya.classes;

public class Cat extends Animal{
	private String color;


	//constructors
	public Cat(String eat, int age, String name, String color) {
		super(eat, age, name);
		this.color = color;
	}

	public Cat(String eat, int age, String name) {
		super(eat, age, name);
	}

	public Cat() {
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
		System.out.println("From calAge() of Cat");
		int catsage= getAge()*3;
		System.out.println("Age is " + catsage);
		return catsage;
	}

}
