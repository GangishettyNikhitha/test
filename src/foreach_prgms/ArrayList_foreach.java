package foreach_prgms;

import java.util.ArrayList;

public class ArrayList_foreach 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> i = new ArrayList<>();
		i.add(1);
		i.add(2);
		i.add(97);
		i.add(34);
		i.add(89);
		System.out.println(i);
		for(Integer i1 : i)
		{
			System.out.println(i1);
		}
	}
}
