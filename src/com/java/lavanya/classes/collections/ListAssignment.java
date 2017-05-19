
package collections;


import java.util.ArrayList;
import java.util.regex.Pattern;


public class ListAssignment {


	public ArrayList<String> findPatternByName(ArrayList<String> l, String pat)
	{
		ArrayList <String> listClone = new ArrayList<String>(); 
		Pattern pattern = Pattern.compile(pat); 
		for (String string : l) {
			if(pattern.matcher(string).find()) {
				listClone.add(string);
			}
		}
		System.out.println(listClone);
		return listClone;

	}

	public String findNameByValue(ArrayList<String> l, String value){

		if(l.contains(value)){
			System.out.println(value); 
			return value;
		}
		else {
			return null;
		}

	}
	public boolean updateValueWithNew(ArrayList<String> l,String oldValue, String newValue) {
		if(l.contains(oldValue)){
			int index = l.indexOf(oldValue);
			System.out.println(l);
			l.set(index, newValue);
			System.out.println(l);
			return true;
		}else 
			return false;

	}
	public void removetheValue(ArrayList<String> l,String value) {
		System.out.println(l);
		l.remove(value);
		System.out.println(l);

	}


	public static void main(String[] args) {

		ListAssignment la= new ListAssignment();
		ArrayList<String> list = new ArrayList<String>();

		list.add("Ramu");
		list.add("Raju");
		list.add("Kaju");
		list.add("Kiran");
		list.add("Manoj");
		list.add("LaRaju");

		System.out.println("Size of list: " + list.size());
		list.forEach(namelist -> System.out.println(namelist));

		String pat="Ra";
		la.findPatternByName(list, pat);
		la.findNameByValue(list, "Ramu");
		la.removetheValue(list, "Kaju");
		la.updateValueWithNew(list, "LaRaju", "LaKaju");

	}

}