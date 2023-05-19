package cursor_prgm;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("hi");
		a.add(null);
		a.add(55.2);
		a.add(true);
		a.add(892);
		a.add(')');
		System.out.println(a);
		ListIterator i = a.listIterator();
		System.out.println("Forward objets are");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Backward objets are");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	}
}
