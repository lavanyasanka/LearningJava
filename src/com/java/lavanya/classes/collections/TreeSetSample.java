package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {
	public static void main(String[] args) {
		
		TreeSet <Integer>treeadd = new TreeSet<Integer>();
	     

		   treeadd.add(12);
		   treeadd.add(13);
		   treeadd.add(14);
		   treeadd.add(15);
		     
		 
		   Iterator iterator;
		   iterator = treeadd.iterator();
		     
		
		   System.out.print("Tree set data: ");     
		   while (iterator.hasNext()){
		   System.out.print(iterator.next() + " ");

		   }
		   System.out.println("Ceiling value for 13: "+treeadd.ceiling(13));  
		   System.out.println("Floor value for 13: "+treeadd.floor(13));  
		   System.out.println("Last highest element: "+treeadd.last());  
	}

}
