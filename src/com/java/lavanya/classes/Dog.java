package com.java.lavanya.classes;

public class Dog extends Animal {
	
	private String name;
	private int age;
	
	
	




	public Dog(String move, String sleep, String eat) {
		super(move, sleep, eat);
	
	}



	public Dog(String move, String sleep, String eat, String name, int age) {
		super(move, sleep, eat);

		this.name = name;
		this.age = age;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getDogYears()
	{
		return age*5;
	}

}
