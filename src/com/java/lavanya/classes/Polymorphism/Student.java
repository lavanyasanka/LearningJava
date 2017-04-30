package com.java.lavanya.classes.polymorphism;

public class Student {
	private String name;     
	private int sid;      
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int sid, int age) {
		super();
		this.name = name;
		this.sid = sid;
		this.age = age;
	}
	public Student() {
		super();
	}

	public Student(int sid) {
		super();
		this.sid = sid;
	}
	public void showDetails(){
		System.out.println("Student Name is " + name);
		System.out.println("Student Id is " + sid);
		System.out.println("Student Age is " + age);
	}
}
