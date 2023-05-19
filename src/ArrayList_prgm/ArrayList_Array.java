package ArrayList_prgm;

import java.util.ArrayList;

public class ArrayList_Array 
{
	public static void main(String[] args) 
	{
		//converting ArrayList to Array
		
		ArrayList<Integer> a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		Object[] o = a.toArray();
		for (int i=0;i<=o.length-1;i++)
		{
			System.out.println("Array Element : "+o[i]);
		}
		
	}
}
