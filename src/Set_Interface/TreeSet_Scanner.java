package Set_Interface;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Scanner 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		TreeSet t = new TreeSet();
		System.out.println("Enter size");
		int size = scan.nextInt();
		for (int i=1;i<=size;i++)
		{
			int ele = scan.nextInt();
			t.add(ele);
		}
		System.out.println("Enter element");
		int num = scan.nextInt();
		System.out.println(t.contains(num)?true:false);
//		if (num==true)
		{
			System.out.println(t.remove(num));
		}
		
	}
}
