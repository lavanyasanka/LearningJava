package com.java.lavanya.classes;

public class Animal {
	
	private String move;
	private String sleep;
	private String eat;
	
	public String getEat() {
		return eat;
	}
	
	public void setEat(String eat) {
		this.eat = eat;
	}
	
	public String getMove() {
		return move;
	}
	
	public void setMove(String move) {
		this.move = move;
	}
	
	public String getSleep() {
		return sleep;
	}
	
	public void setSleep(String sleep) {
		this.sleep = sleep;
	}
	
	public Animal(String move, String sleep, String eat) {
		super();
		// TODO Auto-generated constructor stub
		this.move = move;
		this.sleep = sleep;
		this.eat = eat;
	}
	
	//	public methods of the Animal class
	public void move(){
		System.out.println("I can actually move faster than you");
	}
	
	public void eat(){
		System.out.println("I eat all kinds of food");
	}
	
	public void showDetails(){
		System.out.println("I can "+ move + " faster than you");
		System.out.println("I eat " + eat + " food ");
		System.out.println("I sleep "+sleep);
	}
	
	
}
