package com.java.lavanya.classes;

public class AudiCar extends Car {
	private int seats;
	private String transmission;

	//Constructors
	public AudiCar(int wheels, int doors, int gears, String color, int seats,
			String transmission) {
		super(wheels, doors, gears, color);
		this.seats = seats;
		this.transmission = transmission;
	}


	public AudiCar(int wheels, int doors, int gears, String color) {
		super(wheels, doors, gears, color);
	}


	//getters and setters
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	
	public void showDetails(){
    	System.out.println("Number of wheels :" + getWheels());
    	System.out.println("Number of doors : " +getDoors());
    	System.out.println("Number of gears: " +getGears());
    	System.out.println("Color of the car : " +getColor());
		System.out.println("Number of seats :" +seats);
    	System.out.println("Type of Transmission : " +transmission);

	}
}
