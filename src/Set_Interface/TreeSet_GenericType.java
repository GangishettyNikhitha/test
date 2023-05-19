package Set_Interface;

import java.util.TreeSet;

public class TreeSet_GenericType 
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet<>();
		t.add(6);
		t.add(3);
		t.add(8);
		t.add(5);
		t.add(1);
		t.add(7);
		t.add(11);
		t.add(9);
		t.add(13);
		System.out.println(t);
		
		System.out.println(t.contains(4));
		System.out.println(t.remove(11));
		System.out.println(t);
		System.out.println(t.size());
		t.clear();
		System.out.println(t);
		System.out.println(t.isEmpty());
		System.out.println(t.size());
		
	}
}
