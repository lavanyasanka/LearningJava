package com.java.lavanya.classes.testclasses;
import com.java.lavanya.classes.Cat;
public class TestCat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cat kitty = new Cat("Run", "laydown", "fish","white", true, "Kitty");
		kitty.showDetails();
		//kitty.getEat();
		//kitty.getSleep();
		//kitty.getMove();
		System.out.println("I eat : " + kitty.getEat());
		System.out.println("I sleep by : " + kitty.getSleep());
		System.out.println("I can : " + kitty.getMove());

	}

}
