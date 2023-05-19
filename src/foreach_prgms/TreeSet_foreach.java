package foreach_prgms;

import java.util.TreeSet;

public class TreeSet_foreach 
{
	public static void main(String[] args) 
	{
		TreeSet<String> t = new TreeSet<>();
		t.add("Orange");
		t.add("Blue");
		t.add("White");
		t.add("Yelllow");			
		t.add("Green");
		System.out.println(t);
		for(String s : t)
		{
			System.out.println(s);
		}
	}
}
