package collections;

import java.util.LinkedHashMap;

public class LinkedHashMapSample {
	public static void main(String[] args) {
		
		LinkedHashMap map = new LinkedHashMap(5);

	
		   map.put("One", 1);
		   map.put("Two", 2);
		   map.put("Three", 3);


		   System.out.println("Map:" + map);

		
		 //  map.clear();

		 
		   System.out.println("Map:" + map);
	
		   System.out.println("" + map.containsValue(3));

	
		   System.out.println("" + map.containsValue(5));
		   System.out.println("" + map.get("Three"));

		   System.out.println("" + map.get("Five"));
	}

}
