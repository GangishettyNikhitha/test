package ArrayList_prgm;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_RawScanner 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values");
		for (int j=0;j<=4;j++)
		{
			int i = scan.nextInt();
			a.add(i);
			String s = scan.next();
			a.add(s);
			double d = scan.nextDouble();
			a.add(d);
			boolean b = scan.nextBoolean();
			a.add(b);
			byte b1 = scan.nextByte();
			a.add(b1);
			System.out.println(a);
		}
		//System.out.println(a);
	}
}
