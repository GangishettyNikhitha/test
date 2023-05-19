package LinkedList_prgm;

import java.util.LinkedList;

public class Raw_LinkedList 
{
	public static void main(String[] args) 
	{
		//RAW TYPE OF COLLECTION:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		LinkedList l = new LinkedList();
		l.add("java");
		l.add(8);
		l.add('K');
		l.add(null);
		l.add('K');
		l.add(77.7);
		l.add(true);
		System.out.println(l);
		
		//get method
		System.out.println(l.get(3));
		
		//set method - replacing the object
		System.out.println(l.set(4, 'S'));
		System.out.println(l);
		
		//Contains method
		System.out.println(l.contains(null));
		
		//size method
		System.out.println(l.size());
		
		//remove method
		System.out.println(l.remove(6));
		System.out.println(l.size());
		
		//clear method
		l.clear();
		System.out.println(l);
		
		//isEmpty METHOD
		System.out.println(l.isEmpty());
		
		//adding an object
		l.add(1.3);
		//adding an object at particular index value
		l.add(1, "Nikki");
		System.out.println(l);
		
		//copy method
		l.clone();
		System.out.println(l);
		
		//for the raw type of collection sort method is not allowed.bcz we cant sort diff types of data
	}
}
