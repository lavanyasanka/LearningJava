package com.java.lavanya.classes;

public class Lexus extends Car {
	
	  private boolean isManual;
      private int currentGear;
      
      
      
	public Lexus(int wheels, int doors, int gears, String color,
			boolean isManual, int currentGear) {
		super(wheels, doors, gears, color);
		this.isManual = isManual;
		this.currentGear = currentGear;
	}
	
	
	public Lexus(int wheels, int doors, int gears, String color) {
		super(wheels, doors, gears, color);
	}


	public boolean isManual() {
		return isManual;
	}
	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}
	public int getCurrentGear() {
		return currentGear;
	}
	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	
	public void showDetails(){
    	System.out.println("Number of wheels :" + getWheels());
    	System.out.println("Number of doors : " +getDoors());
    	System.out.println("Number of gears: " +getGears());
    	System.out.println("Color of the car : " +getColor());
		System.out.println("Number of currentGear :" + currentGear);
    	System.out.println("Is Type of gears manual : " + isManual);

	}
}
