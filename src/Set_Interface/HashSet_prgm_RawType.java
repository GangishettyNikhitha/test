package Set_Interface;

import java.util.Collections;
import java.util.HashSet;

public class HashSet_prgm_RawType {

	public static void main(String[] args) 
	{	
		HashSet<Object> h = new HashSet<>();
		h.add(1);
		h.add("Pencil");
		h.add('#');
		h.add(false);
		h.add(97.9);
		h.add('#');
		h.add(null);
		System.out.println(h);
		
		//NO.of objects
		System.out.println(h.size());
		
		//Return same element from 2 hashset
		HashSet<Object> h2 = new HashSet<>();
		h2.add(1);
		h2.add('#');
		h2.add("Hello");
		System.out.println(h2);
		
		System.out.println(h.retainAll(h2));
		
		//sort the elements in reverse order
		Collections.reverseOrder();
		System.out.println(h2);
		
		// I Love java Library to ILoveJavaLibrary
		 
		
	}

}
