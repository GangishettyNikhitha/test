package cursor_prgm;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ListIterator_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(77.7);
		l.add(57);
		l.add('#');
		l.add("Nikki");
		l.add(true);
		l.add(null);
		System.out.println(l);
		ListIterator i  = l.listIterator();
	//Returning the Forward object:
		System.out.println(i.next());
		//Checking whether the next object is present or not:
		System.out.println(i.hasNext());
	//Returning the Backward object:
		System.out.println(i.previous());
		//Checking whether the previous object is present or not:
		System.out.println(i.hasPrevious());
	//removing the object from collection:
		i.remove();
		System.out.println(l);
		try
		{
		System.out.println(i.hasPrevious());
		System.out.println(i.previous());
		}
		catch(NoSuchElementException s)
		{
		System.out.println("We Dont have any previous element");
		}
	}
}
