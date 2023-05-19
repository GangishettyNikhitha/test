package cursor_prgm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class Iterator_program1 
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet<>();
		h.add(2);
		h.add("Marker");
		h.add(66.6);
		h.add(false); 
		h.add(null);
		System.out.println(h);
		Iterator i = h.iterator();
	//Returning the forward object:
		System.out.println(i.next());
		System.out.println(i.next());
	//Checking whether the next object is present or not:
		System.out.println(i.hasNext());
		System.out.println(i.next());
	//Removing the object from Collection:
		i.remove();
		System.out.println(h);
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		try
		{
			System.out.println(i.next());
		}
		catch(NoSuchElementException n )
		{
			System.out.println("We Dont have any object to retain");
		}
	}
}
