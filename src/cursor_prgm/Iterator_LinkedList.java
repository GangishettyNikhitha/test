package cursor_prgm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Iterator_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
			l.add(78);
			l.add(null);
			l.add('@');
			l.add(true);
			System.out.println(l);
			Iterator i = l.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
//			//Returning the forward object:
//					System.out.println(i.next());
//					System.out.println(i.next());
//				//Checking whether the next object is present or not:
//					System.out.println(i.hasNext());
//					System.out.println(i.next());
//				//Removing the object from Collection:
//					System.out.println(i.hasNext());
//					System.out.println(i.next());
//					i.remove();
//					System.out.println(a);
//					System.out.println(i.hasNext());
//					System.out.println(i.next());
//					System.out.println(i.hasNext());
//					System.out.println(i.next());
//					System.out.println(i.hasNext());
//					try
//					{
//						System.out.println(i.next());
//					}
//					catch(NoSuchElementException n )
//					{
//						System.out.println("We Dont have any object to retain");
//					}
		}
	}

