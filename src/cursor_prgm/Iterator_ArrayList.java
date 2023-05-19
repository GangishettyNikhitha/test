package cursor_prgm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("java");
		a.add(78);
		a.add(null);
		a.add(99.9);
		a.add('@');
		a.add(true);
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
