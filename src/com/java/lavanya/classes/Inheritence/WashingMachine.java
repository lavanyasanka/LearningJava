package com.java.lavanya.classes;

import com.java.lavanya.classes.inheritence.Product;

public class WashingMachine extends Product

{
	private int no=10;

	public void switchOn ()
	{
		System.out.println ("The lid is open.");
	}
	public void start ()
	{
		System.out.println ("Start washing ...");
	}
	public void acceptDetergent ()
	{
		System.out.println("Adding Detergent.. ");
		start();
	}
	public int acceptClothes()
	{
		System.out.println("Enter no of clothes: ");
		return no;
	}
	public void switchOff ()
	{
		System.out.println ("The lid is closed.");
	}

}