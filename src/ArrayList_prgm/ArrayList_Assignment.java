package ArrayList_prgm;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Assignment 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> b  = new ArrayList();
		b.add(90);
		b.add(29);
		b.add(123);
		b.add(8654);
		b.add(90);
		b.add(21);
		b.add(10);
		b.add(8654);
		b.add(45);
		System.out.println(b);
		//remove 1,5 and last object
		
//		System.out.println(b.remove(0));
//		System.out.println(b.remove(4));
//		System.out.println(b.size()-1);
//		System.out.println(b);
		
		//sorting an object
		
//		Collections.sort(b);
//		System.out.println(b);
		
		//return all objects one by one
		
//		for (int i=0;i<=b.size()-1;i++)
//		{
//			System.out.println(b.get(i));
//		}
		
		//checking particular object from arraylist
		
		System.out.println(b.contains(4));
	}
}
