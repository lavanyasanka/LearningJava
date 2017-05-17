package collections;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Ramu");
		list.add("Raju");
		list.add("Kaju");
		list.add("Kiran");
		list.add("Manoj");
		
		System.out.println("Size of list: " + list.size());
		list.forEach(namelist -> System.out.println(namelist));

		boolean found = list.contains("Kiran");

		if(found)
		{
			int position = list.indexOf("Kiran");
			System.out.println("position is found at: " + position);

			list.add(position, "Kiran");

		}

		else
			list.add("kiran");

		System.out.println("Size of list: " + list.size());
		list.forEach(namelist -> System.out.println(namelist));

	}



}
