package cursor_prgm;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

public class Iterator_LinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet a = new LinkedHashSet();
		a.add("java");
		a.add(78);
		a.add(null);
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
