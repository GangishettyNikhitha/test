package vector_prgms;

import java.util.Vector;

public class vector_palindrome 
{
	public static void main(String[] args) 
	{
		String s = "MadaM";
		String str = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			str=str+ch;
		}
		Vector v = new Vector();
		v.add(str);
		if (s.equals(v.get(0)))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
