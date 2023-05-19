package cursor_prgm;
import java.util.ListIterator;
import java.util.Vector;

public class ListIterator_Vector 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(null);
		v.add("Library");
		v.add(true);
		v.add(88.8);
		v.add('=');
		v.add(892);
		System.out.println(v);
		ListIterator i = v.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	}
}
