package collections;

import java.util.*;

public class HashMapSample {
	
	public static void main(String[] args) {
		
		
		HashMap newmap = new HashMap();

		   newmap.put(1, "Ramu");
		   newmap.put(2, "Raju");
		   newmap.put(3, "Kiran"); 
		      
		  
		   System.out.println("Check if key 2 exists: " + newmap.containsKey(2));
		   
		   System.out.println("Check if value 'Raju' exists: " + 
				   newmap.containsValue("Raju"));
		   
		   String val=(String)newmap.get(3);
		   System.out.println("Value for key 3 is: " + val);
		   
		   Set keyset=newmap.keySet();
		   System.out.println("Key set values are: " + keyset);
		   
	}

}
