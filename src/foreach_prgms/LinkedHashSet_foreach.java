package foreach_prgms;

import java.util.LinkedHashSet;

public class LinkedHashSet_foreach 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l = new LinkedHashSet<>();
		l.add("Nikhitha");
		l.add('G');
		l.add(75);
		l.add(88.9);
		l.add(true);
		System.out.println(l);
		for (Object o:l)
		{
			System.out.println(o);
		}
	}
}
