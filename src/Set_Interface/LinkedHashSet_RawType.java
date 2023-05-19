package Set_Interface;

import java.util.LinkedHashSet;

public class LinkedHashSet_RawType 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lh = new LinkedHashSet<>();
		lh.add("hai");
		lh.add(5);
		lh.add(55.5);
		lh.add(true);
		lh.add(null);
		lh.add('@');
		System.out.println(lh);
		System.out.println(lh.size());
		
		System.out.println(lh.remove(5));
		System.out.println(lh.size());
		System.out.println(lh.contains("hai"));
		lh.clear();
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.size());
		
		//wap to remove duplicates from given String by using linkedhashset
			
		
		//System.out.println();
	}
}
