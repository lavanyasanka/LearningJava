package com.java.lavanya.classes;

public class Animal {

	private String eat;
	protected int age;
	private String name;

	//getter and setter methods
	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// constructors
	public Animal(String eat, int age, String name) {
		super();
		this.eat = eat;
		this.age = age;
		this.name = name;
	}

	public Animal(){
		super();

	}
	public int calAge(){
		System.out.println("Age is " +age);
		return age;
	}

	public void showDetails(){
		System.out.println(name);
		System.out.println("Age is "+age);
		System.out.println(name + eat + " as food . ");

	}


}
