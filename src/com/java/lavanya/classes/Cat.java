package com.java.lavanya.classes;

	public class Cat extends Animal{
		private String color;
		private boolean bites;
		private String name;
		
		public Cat(String move, String sleep, String eat, boolean bites, String name) {
			super(move, sleep, eat);
			// TODO Auto-generated constructor stub
			this.bites = bites;
			this.name = name;
		}
		public Cat(String move, String sleep, String eat, String color, String name) {
			super(move, sleep, eat);
			// TODO Auto-generated constructor stub
			this.color = color;
			this.name = name;
		}
		public boolean isBites() {
			return bites;
		}
		public void setBites(boolean bites) {
			this.bites = bites;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Cat(String move, String sleep, String eat, String color, boolean bites, String name) {
			super(move, sleep, eat);
			// TODO Auto-generated constructor stub
			this.color = color;
			this.bites = bites;
			this.name = name;
		}
		
		public Cat(String move, String sleep, String eat) {
			super(move, sleep, eat);

		}
		
		public void showDetails(){
			System.out.println("My Name is "+ name);
			System.out.println("My color is " + color);
			System.out.println("Do I bite : "+ bites);
		}
		

}
