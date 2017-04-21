package com.java.lavanya.classes;

public class Car {
    private int wheels;
    private int doors;
    private int gears;
   // private boolean isManual;
    private String color;
    
    //getter and setters
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//constructors
	public Car(int wheels, int doors, int gears, String color) {
		super();
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.color = color;
	}
	public Car(int wheels, int doors, String color) {
		super();
		this.wheels = wheels;
		this.doors = doors;
		this.color = color;
	}
	public Car() {
		super();
	}
	
    public void showDetails(){
    	System.out.println("Number of wheels :" +wheels);
    	System.out.println("Number of doors : " +doors);
    	System.out.println("Number of gears: " +gears);
    	System.out.println("Color of the car : " +color);
    }
}
