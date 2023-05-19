package cursor_prgm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Iterable_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> a = new TreeSet<>();
		a.add("This");
		a.add("TreeSet");
		a.add("allows");
		a.add("only");
		a.add("Homogenous");
		a.add("values");
		System.out.println(a);
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
//		//Returning the forward object:
//				System.out.println(i.next());
//				System.out.println(i.next());
//			//Checking whether the next object is present or not:
//				System.out.println(i.hasNext());
//				System.out.println(i.next());
//			//Removing the object from Collection:
//				System.out.println(i.hasNext());
//				System.out.println(i.next());
//				i.remove();
//				System.out.println(a);
//				System.out.println(i.hasNext());
//				System.out.println(i.next());
//				System.out.println(i.hasNext());
//				System.out.println(i.next());
//				System.out.println(i.hasNext());
//				try
//				{
//					System.out.println(i.next());
//				}
//				catch(NoSuchElementException n )
//				{
//					System.out.println("We Dont have any object to retain");
//				}
}
}
