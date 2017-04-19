package com.java.lavanya.classes;

public class Dog {
	private String name;
	private int age;
	private double weight;
	
	public Dog(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	} 
	public int getDogYears()
	{
		return age*5;
	}
	
	public void addAYear()
	{
		age = age + 1;
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
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String showDetails()
	{
		String details = "";
		details = name;
		details = details + "\n\tAge: " + age;
		details = details + "\n\tWeight: " + weight;
		
		
		return details;
	}
}
