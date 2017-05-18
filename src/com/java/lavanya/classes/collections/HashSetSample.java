package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSample {

	
	public static void main(String[] args) {
		
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(209);
		set.add(109);
		set.add(108);
		set.add(107);
		set.add(106);
		set.add(105);
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		boolean isremoved = set.remove(108); 
		 System.out.println("Return value after remove: "+isremoved); 
		
		 System.out.println("Values after remove: "+set); 
	}
}
