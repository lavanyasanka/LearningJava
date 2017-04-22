package com.java.lavanya.classes.testclasses;

import com.java.lavanya.classes.WashingMachine;

public class TestWhashingMachine {

	public static void main(String[] args)
	{
		WashingMachine wm=new WashingMachine();
		wm.switchOn();
		int numOFClothes=wm.acceptClothes();
		wm.acceptDetergent();
		wm.switchOff();
		System.out.println(numOFClothes+" clothes get washed");
		wm.setPrice(6000.00);
		wm.setProductDescription("good washing machine");
		wm.setProductId(9999);
		wm.productName="Washing Machine";
		System.out.println(wm.toString());
	}
}
