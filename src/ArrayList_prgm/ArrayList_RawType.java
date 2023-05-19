package ArrayList_prgm;

import java.util.ArrayList;

public class ArrayList_RawType 
{
	//Raw type of Collection:
	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList();
		a.add(45);
		a.add("Dinga");
		a.add('#');
		a.add(false);
		a.add(5);
		a.add(null);
		a.add(5);
	System.out.println(a);
	}
}
