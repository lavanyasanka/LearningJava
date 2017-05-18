package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetSample {
	
public static void main(String[] args) {
	
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	
	lhs.add("Ramu");
	lhs.add("Raju");
	lhs.add("Rani");
	lhs.add("Rathu");
	lhs.add("Rahul");
	lhs.add("Rohan");
	lhs.add("Mohan");
	
	Iterator<String> it = lhs.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	boolean isremoved = lhs.remove("Rani"); 
	 System.out.println("Return value after remove: "+isremoved); 
	
	 System.out.println("Values after remove: "+ lhs); 
	
}
}
