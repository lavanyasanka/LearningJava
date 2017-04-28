package com.java.lavanya.classes;

public class TestVirtualMethodInvocation {

	public static void main(String[] args) {

		VeteranDoctor vet = new VeteranDoctor();
		Animal a = new Lion();
		a.setAge(2);
		vet.calcAgeOfAnimal(a);

		Animal a1= new Cat();
		a1.setAge(4);
		vet.calcAgeOfAnimal(a1);


		Animal a2= new Dog();
		a2.setAge(3);
		vet.calcAgeOfAnimal(a2);
	}

}
