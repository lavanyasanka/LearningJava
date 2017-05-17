package collections;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer> ();
		Vector<Integer> vectwin = new Vector<Integer> ();

		vector.add(13);
		vector.add(14);
		vector.add(15);
		vector.add(16);
		vector.add(17);
		vector.add(18);
		vector.add(19);

		vector.size();
		System.out.println("Number of elements in vector is :" +vector.size());
		vector.capacity();
		System.out.println("Capacity of vector is :" +vector.capacity());

		vector.forEach(value -> System.out.println(value));

		vectwin = (Vector)vector.clone();
		System.out.println("Clone of vector ---vectwin");
		vectwin.forEach(value -> System.out.println(value));

		vectwin.firstElement();

		if(!vectwin.isEmpty() && !vector.isEmpty()){

			System.out.println("********************");


			if(vectwin.firstElement() == vector.firstElement()){

				System.out.println("First elements in both the vectors are same....");

				vectwin.insertElementAt(12, 0);

				vectwin.forEach(value -> System.out.println("values in vectwin are: " +value));

				vector.remove(0);

				vector.forEach(value -> System.out.println("values in vector are: " +value));
			}
			else

				System.out.println("First elements in both the vectors are not same....");

		}

		else{
			System.out.println("___________________________________________________");
			vector.addAll(vectwin);
			vector.forEach(number -> System.out.println("list of all numbers in two vectors" +number));
		}

		vectwin.clear();
		System.out.println("elements in vectwin after clear");
		vectwin.forEach(value -> System.out.println(value));
		//vectwin.get(0);

		System.out.println("Capacity of vector is :" +vector.capacity());

		vector.trimToSize();

		System.out.println("Capacity of vector is :" +vector.capacity());
	}

}
