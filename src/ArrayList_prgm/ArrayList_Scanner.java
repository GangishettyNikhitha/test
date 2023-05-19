package ArrayList_prgm;

import java.util.ArrayList;
import java .util.Scanner;

public class ArrayList_Scanner 
{
	public static void main(String[] args)
	{	
		//GENERIC TYPE OF COLLECTION:
		ArrayList<Integer> a = new ArrayList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values");
		for (int i=0;i<=4;i++)
		{
			int a1 = scan.nextInt();
			a.add(a1);
		}
		System.out.println(a);
	}
	
}
