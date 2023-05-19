package LinkedList_prgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Assignment 
{
	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add("Hi");
		l1.add(5);
		l1.add('M');
		l1.add(null);
		LinkedList l2 = new LinkedList();
		l2.add("How are you");
		l2.add(55.5);
		l2.add('@');
		l2.add(true);
		
		System.out.println(l1);
		System.out.println(l2);
		
		//objects in reverse order	
//		for (int i=l1.size()-1;i>=0;i--)
//		{
//			System.out.println(l1.get(i));
//		}
//		
//		//merging 2 linkedlists
//		l1.addAll(l2);
//		System.out.println(l1);
//		
//		// shuffle
//		Collections.shuffle(l1);
//		//System.out.println(l1);
//		
		//convert linkedlist to arraylist
		ArrayList a = new ArrayList(l1);
		System.out.println(a); 
		
		//shuffle objects from linkedlist
		Collections.shuffle(l1);
		System.out.println(l1);
		
		//remove first and last object
		
		System.out.println(l1.removeFirst());
		System.out.println(l1);
		System.out.println(l1.removeLast());
		System.out.println(l1);
		
		
		
		
		
	}
}
