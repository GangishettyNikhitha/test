package vector_prgms;

import java.util.Vector;

public class Vector_RawType 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("Mobile");
		v.add(13);
		v.add('y');
		v.add(false);
		v.add(null);
		v.add(123);
		v.add(1234567890l);
		System.out.println(v);
		System.out.println(v.capacity());
	}
}
