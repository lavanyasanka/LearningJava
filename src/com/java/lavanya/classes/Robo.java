package com.java.lavanya.classes;

public class Robo extends Object{

	private double speed;
	private int memory;
	private String name;

	public Robo(double speed, int memory, String name) {
		super();
		this.speed = speed;
		this.memory = memory;
		this.name = name;
	}
	public Robo(){
		super();
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/*public String showDetails() {

		String info = "Robo name= "+name+", memory = "+memory+", speed = "+speed;

		return info;
	}*/

	@Override
	public String toString() {
		String info = "Robo name= "+name+", memory = "+memory+", speed = "+speed;

		return info;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Robo){
			Robo robo1 = (Robo)obj;
			if((this.speed == robo1.speed ) && (this.memory == robo1.memory ) && (this.name.equals(robo1.name)))
			
			return true;
			}
		
		return false;
	}
	

}
