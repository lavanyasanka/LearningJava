package com.java.lavanya.classes;

public class TestDog {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.height = 3.1f;
		d.weight = 30f;
		d.breed = "Bull dog";
		d.gender='m';
		d.age= 5;
		d.color="brown";

		d.showDog();
		d.bark();
		d.wagTail();
		d.walk();


		Dog gs =new Dog();
		gs.color = "white";
		gs.height = 2.5f;
		gs.weight = 24f;
		gs.breed = "German Shepherd";
		gs.gender = 'm';
		gs.age=4;

		gs.showDog();
		gs.wagTail();
		gs.bark();

	}
}


class Dog {

	float height;
	float weight;
	String color;
	char gender;
	String breed;
	int age;

	void bark() {
		System.out.println(breed+" is barking");
	}
	void walk() {
		System.out.println(breed+" is walking");
	}
	void wagTail() {
		System.out.println(breed+" is wagging the tail");
	}

	void showDog(){
		System.out.println("Bread is "+breed);
		System.out.println("Height is "+height);
		System.out.println("Weight is "+weight);
		System.out.println("Color is "+color);
		System.out.println("Gender is "+gender);
		System.out.println("Age is "+age);
	}
}


