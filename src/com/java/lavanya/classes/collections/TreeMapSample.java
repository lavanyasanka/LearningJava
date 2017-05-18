package collections;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapSample {

	
	public static void main(String[] args) {
		
		NavigableMap<Integer, String> treemap = new TreeMap<Integer, String>();
	      
		   // populating tree map
		   treemap.put(2, "two");
		   treemap.put(1, "one");
		   treemap.put(3, "three");
		   treemap.put(6, "six");
		   treemap.put(5, "five");
		      
		   System.out.println("Ceiling entry for 4: "+ treemap.ceilingEntry(4));
		   System.out.println("Ceiling entry for 5: "+ treemap.ceilingEntry(5));
		
		   NavigableSet nset=treemap.descendingKeySet();
		      
		   System.out.println("Checking value");
		   System.out.println("Navigable set values: "+nset);
		   System.out.println("Checking value for key 3");
		   System.out.println("Value is: "+ treemap.get(3));
		   
		   TreeMap<Integer, String> treemap_putall = new TreeMap<Integer, String>();	   
		   treemap_putall.put(1, "111"); 
		   treemap_putall.put(2, "222");
		   treemap_putall.put(7, "777");      
		      
		   System.out.println("Value before modification: "+ treemap);
		      
		   // Putting 2nd map in 1st map
		   treemap.putAll(treemap_putall);
		      
		   System.out.println("Value after modification: "+ treemap);
	}
}
