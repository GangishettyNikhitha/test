package cursor_prgm;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Vector 
{
	public static void main(String[] args) 
	{
		Vector v =  new Vector();
		v.add(true);
		v.add(88.9);
		v.add(32);
		v.add(null);
		v.add("Hello");
		v.add('*');
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
